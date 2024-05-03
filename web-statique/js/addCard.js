function addCard(){

    let data = {
        "name": document.getElementsByName('name')[0].value,
        "description": document.getElementsByName('description')[0].value,
        "family": document.getElementsByName('family')[0].value,
        "affinity": document.getElementsByName('affinity')[0].value,
        "imgUrl": document.getElementsByName('imgURL')[0].value,
        "smallImgUrl": document.getElementsByName('smImgURL')[0].value,
        "energy": document.getElementsByName('energy')[0].value,
        "hp": document.getElementsByName('hp')[0].value,
        "defence": document.getElementsByName('defence')[0].value,
        "attack": document.getElementsByName('attack')[0].value,
        "price": document.getElementsByName('price')[0].value,
        "userId": document.getElementsByName('userid')[0].value
    }

    fetch("http://tp.cpe.fr:8083/card", {
        method: "POST",
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
          },
        body: JSON.stringify(data)
    })
    .then((response) => response.json())
    .then((json) => console.log(json));
}
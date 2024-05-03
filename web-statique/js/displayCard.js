function display(){
    const urlParms = new URLSearchParams(window.location.search);
    console.log(urlParms)

    let id = urlParms.get('id');
    fetch(`http://tp.cpe.fr:8083/card/${id}`,)
        .then((response) => response.json())
        .then((json) => {
            console.log(json)
            let template = document.querySelector("#selectedCard");

            let clone = document.importNode(template.content, true);
                
            newContent= clone.firstElementChild.innerHTML
                        .replace(/{{family_src}}/g, json.smallImgUrl)
                        .replace(/{{family_name}}/g, json.family)
                        .replace(/{{img_src}}/g, json.imgUrl)
                        .replace(/{{name}}/g, json.name)
                        .replace(/{{description}}/g, json.description)
                        .replace(/{{hp}}/g, json.hp)
                        .replace(/{{energy}}/g, json.energy)
                        .replace(/{{attack}}/g, json.attack)
                        .replace(/{{defense}}/g, json.defence);
            clone.firstElementChild.innerHTML= newContent;
                
            let cardContainer= document.querySelector("#cardContainer");
            cardContainer.appendChild(clone);
        });


}

display()
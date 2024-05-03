async function fetchCards(url) {
    const response = await fetch(url);
    try {
        if (response.ok) {
            const data = await response.json();
            console.log('Données reçues:', data);
            return data
        } else {
            console.error('Erreur avec la requête:', response.statusText);
        }
    } catch (error) {
        console.error('Erreur lors de la requête:', error);
    }
}

let template = document.querySelector("#selectedCard");

fetchCards("http://tp.cpe.fr:8083/cards").then(cards => {
    for(const card of cards) {
        let clone = document.importNode(template.content, true);

        newContent = clone.firstElementChild.innerHTML
            .replace(/{{family_src}}/g, card.family)
            .replace(/{{family_name}}/g, card.name)
            .replace(/{{image_src}}/g, card.imgUrl)
            .replace(/{{date}}/g, card.date)
            .replace(/{{comment}}/g, card.description)
            .replace(/{{like}}/g, card.like)
            .replace(/{{button}}/g, card.button);
        clone.firstElementChild.innerHTML= newContent;

        let cardContainer= document.querySelector("#gridContainer");
        cardContainer.appendChild(clone);
    }
});

display()
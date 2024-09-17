// alert("hello")

// const expandBtn = document.querySelector(".expand-btn");
const expandBtns = document.querySelectorAll(".expand-btn");

// expandBtn.innertext='-'
// console.dir(expandBtn);

expandBtns.forEach(btn => btn.addEventListener("click",onclick));
// expandBtn.addEventListener('click', onclick);
function onclick(event) {
    // console.log("Btn clicked");
    // console.log(event.target);
    const currentBtn = event.target;

    currentBtn.innerText = currentBtn.innerText === "+" ? "-" : "+";

    const currentParent = currentBtn.closest('.faq');
    console.log(currentParent);

    const currentAnswer = currentParent.querySelector(".answer");
    // console.log(currentAnswer);
    currentAnswer.classList.toggle('hide');
}
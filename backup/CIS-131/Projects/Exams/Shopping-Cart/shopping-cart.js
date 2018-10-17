// Author: Vert, David  9/24/2018
var shoppingCart = {
    fName: "Cherry",
    lName: "Blossom",
    cart: ["Penguin", 3.33, "Duck", 4.54, "Potato", 7.56, "Goose", 1.19, "Poison", 0.01, "TV", 25.99, "New Life", 999.99, "Dr. Pepper", 0.68], // Feel free to add, or change this array. Odd numbers in the array are items, even numbers in the array are prices, that is if you start on odd, else it would be reversed

    printShoppingCart() {
        var str = console.log(`Name: ${this.fName} ${this.lName},

Items purchased:`);
        console.log(); // Not necessary, just to inhance visual appeal
        this.show();
        return str;
    },

    show() {
        var total = 0;
        var i = 0;
        var item;
        var price = 0;
        while (i < this.cart.length) {
            item = this.cart[i];
            price = this.cart[i + 1];
            console.log(`${item}: $${price}`);
            total = Math.round((total + price) * 100) / 100;
            i += 2;
        }
        console.log(); // Not necessary, just to inhance visual appeal
        console.log(`Total price: $${total}`);
        return total;
    }
};

shoppingCart.printShoppingCart();
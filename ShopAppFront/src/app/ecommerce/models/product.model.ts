export class Product {
    id: number;
    name: string;
    price: number;
    discount: number;
    pictureUrl: string;

    constructor(id: number, name: string, price: number, discount: number, pictureUrl: string) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pictureUrl = pictureUrl;
        this.discount = discount;
    }
}
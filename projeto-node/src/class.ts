interface Pingable {
    ping(): void;
}

class Point implements Pingable{
    _x: number = 0;
    _y: number = 0;
    readonly name: string ="This point";

    constructor(otherName?: string) {
        if (otherName !== undefined) {
            this.name = otherName;
        }
    }

    static jump = () => console.log("jump");

    ping = (): void => console.log("ping");

    printPoint = () => `X: ${this._x}, Y: ${this._y}`;

    get x(): number {
        return this._x;
    }

    set x(val: number) {
        this._x = val;
    }

    get y(): number {
        return this._y;
    }

    set y(val: number) {
        this._y = val;
    }
}

class DPoint extends Point {
    z: number = 0;
    printPoint = () => {
        return super.printPoint()+`Z: ${this.z}`
    }
}

type TPoint = {
    x: number,
    y: number
}

let p = new Point("That point");
p.x = 12;
p.y = 6;
console.log(p.printPoint());



class CBox<T> {
    _contents: T[] = [];

    addItem = (item: T) => this._contents.push(item);
    removeLastItem = () => this._contents.pop();
    get contents() {
        return this._contents;
    }

    set contents() 
}
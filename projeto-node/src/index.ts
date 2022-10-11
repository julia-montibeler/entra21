console.log("teste");

type Rect = {
    width: number,
    height?: number
}

type Triangle = {
    angle: number,
    type: "isosceles" | "scalene" | "obtuse"
}

type Circle = {
    radius: number;
}

type GeometricFigure = Rect | Triangle | Circle;

let rect = {
    width: 20,
    height: 30
}

let t: GeometricFigure = {
    angle: 45,
    type: "scalene"
}

console.log(rect.height);
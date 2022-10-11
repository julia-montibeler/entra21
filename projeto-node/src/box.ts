type Box<Type = any> = {
    contents?: Type[]
    contentLength: () => number;
}

let box: Box<string> = {
    contents: [],
    contentLength: () => box.contents?.length ?? 0
};

box.contents?.push("conteudo");

let box2: Box<number> = {
    contents: [],


    
    contentLength: () => box.contents?.length ?? 0
}

box2.contents?.push(12)

let box3: Box = {
    contents: [],
    contentLength: () => box.contents?.length ?? 0
}

box3.contents?.push(10)
box3.contents?.push("teste")

function tes(arg: any): any {
    return arg;
}
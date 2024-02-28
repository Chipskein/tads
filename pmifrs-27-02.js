function abs(n){
    return n<0 ? -n:n
}
function my_pow(base, exp) {
    if (typeof base!='number'){
        return NaN
    }
    if (typeof exp != 'number') {
        return NaN
    }
    if (exp == 0){
        return 1
    }
    if (exp % 1!=0) { 
        throw new Error("'exp' decimal not supported")
    }
    let res = exp < 0 ? (1/base):base
    for (let i = 1; i < abs(exp); i++){
        res *= exp < 0 ? (1 / base) :base
    };
    return res
}
//console.log("quoka is working")
//b1=2//const literal number
//ex=8
//console.log(b1**ex,Math.pow(b1,ex))
//console.log(Math.pow([""], ex))
//console.log(Math.pow(["jasfjas"], ex))
console.log(my_pow(2, 8))
console.log(my_pow(2.999999999999999999999999999999, 10))
console.log(my_pow(0, 1))
console.log(my_pow(1, 1))
console.log(my_pow(12, 0))
console.log(my_pow(12, 1))
console.log(my_pow(NaN, 0))
console.log(my_pow(Infinity, 0))
console.log(my_pow(Infinity, 12))
console.log(my_pow(-2, 3))
console.log(my_pow(-0, 0))
console.log(my_pow(-0, 1))
console.log(my_pow({}, 1))
console.log(my_pow([], 1))
console.log(my_pow(true, 1))
console.log(my_pow({"map":[]}, 1))
console.log(my_pow("12", 1))
console.log(my_pow("edge_case", 1))
console.log(my_pow("true", 0))
console.log(my_pow())
console.log(my_pow(2,-2))
console.log(my_pow(2, -10))
console.log(my_pow(2, -8))

console.log(my_pow(3, -3.2))


package org.techtown.starcraft2

class Starcraft2Unit {
    var unitName:String?=null
    var img:String?=null
    var info:String?= null
    constructor(){}
    constructor(
        img:String,
        unitName:String,
        info:String
    ){
        this.unitName = unitName
        this.img = img
        this.info = info
    }
}
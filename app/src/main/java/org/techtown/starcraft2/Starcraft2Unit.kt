package org.techtown.starcraft2

class Starcraft2Unit {
    var unitName:String?=null
    var info:String?= null
    constructor(){}
    constructor(
        unitName:String,
        info:String
    ){
        this.unitName = unitName
        this.info = info
    }
}
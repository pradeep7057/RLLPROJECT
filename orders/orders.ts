export class Orders {
    public orderid : number;
    public customerid : number;
    public vendorid : number;
    public menuid : number;
    public walletsource: string;
    public orderquantity : number;
    public orderbillamount : number;
    public orderstatus: string;
	public ordercommands: string;
    public orderdate: Date;
    constructor(){}
}

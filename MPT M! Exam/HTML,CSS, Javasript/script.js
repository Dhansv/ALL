/* -------------------------------------------------------------------------------
 File		:	Customer_Detail.txt
AuthorName	:	Abhishek Tiwari
Description	:	Javascript for calculating total ammount and displaying data
Version		: 	1.0
Date		:	11/12/2017
----------------------------------------------------------------------------------*/
function setprice()
{
var product=document.myform.product.value;
if(product=="pendrive")
    {
	document.myform.txtNum.value="600";
	}
	if(product=="memorycard")
    {
	document.myform.txtNum.value="400";
	}
	if(product=="speaker")
    {
	document.myform.txtNum.value="800";
	}
}
function Calculate()
{
	/* retriving data from form and storing in the js variables */
var price=parseInt(document.getElementById("txtNum").value);
var quantity=parseInt(document.getElementById("txtqun").value);

	/* Calculating the total Price */
var total_amount=price*quantity;

	/* Displaying the total ammount on the alert box*/
alert("Your Billing amount is Rs. "+ total_amount);
}

	
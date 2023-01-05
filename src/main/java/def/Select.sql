/*
 ***
 */

select all from table;

select e.EmployeeID, sum(Price*Quantity) from Employees e join Orders o on e.EmployeeID=o.EmployeeID
                                                          join OrderDetails od on od.OrderID=o.OrderID
                                                          join Products p on p.ProductID=od.ProductID
                                                          group by e.EmployeeID
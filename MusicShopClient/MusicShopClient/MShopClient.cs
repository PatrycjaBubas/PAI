using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MusicShopClient.ServiceReference1;

namespace MusicShopClient
{
    public partial class MShopClient : Form
    {
        public MShopClient()
        {
            InitializeComponent();

            using (MusicShopWebServiceClient service = new MusicShopWebServiceClient())
            {
                categories[] catData = service.getAllCategories();
                users[] usersData = service.getAllUsers();
                products[] productsData = service.getAllProducts();

                comboBoxCategories.Items.Clear();
                userComboBox.Items.Clear();
                productComboBox.Items.Clear();
                foreach (categories c in catData)
                {
                    comboBoxCategories.Items.Add(c.catName);
                }

                foreach (users u in usersData)
                {
                    userComboBox.Items.Add(u.usrLogin);
                }

                foreach (products p in productsData)
                {
                    productComboBox.Items.Add(p.prdName);
                }
            }

        }

        private void button1_Click(object sender, EventArgs e)
        {
            using (MusicShopWebServiceClient service = new MusicShopWebServiceClient())
            {

                products[] data = service.getAllProducts();

                listBoxProducts.Items.Clear();
                foreach (products p in data)
                {
                    listBoxProducts.Items.Add(p.prdId + " " + p.prdName + " " + p.prdAmount + " " + p.prdPrice);
                }
            } 

        }

        private void button2_Click(object sender, EventArgs e)
        {
            using (MusicShopWebServiceClient service = new MusicShopWebServiceClient())
            {
                service.removeProduct(int.Parse(productIdListBox.Text));
            }
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label5_Click(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            using (MusicShopWebServiceClient service = new MusicShopWebServiceClient())
            {
                int productId = int.Parse(productIdBox.Text);
                string name = productNameBox.Text;
                int amount = int.Parse(productAmountBox.Text);
                double price = double.Parse(productPriceBox.Text);
                string description = productDescriptionBox.Text;
                string catName = comboBoxCategories.Text;

                service.addNewProduct(productId, name, price, amount, description, catName);

            }
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            //using (MusicShopWebServiceClient service = new MusicShopWebServiceClient())
            //{
            //    categories[] data = service.getAllCategories();

            //    comboBoxCategories.Items.Clear();
            //    foreach (categories c in data)
            //    {
            //        comboBoxCategories.Items.Add(c.catName);
            //    }
            //}
        }

        private void button4_Click(object sender, EventArgs e)
        {
            using (MusicShopWebServiceClient service = new MusicShopWebServiceClient())
            {
                categories[] data = service.getAllCategories();

                listBoxCategories.Items.Clear();
                comboBoxCategories.Items.Clear();
                foreach (categories c in data)
                {
                    listBoxCategories.Items.Add(c.catName);
                    comboBoxCategories.Items.Add(c.catName);
                }
            }
        }

        private void label7_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void label8_Click(object sender, EventArgs e)
        {

        }

        private void productPriceBox_TextChanged(object sender, EventArgs e)
        {

        }

        private void showOrdersButton_Click(object sender, EventArgs e)
        {
            using (MusicShopWebServiceClient service = new MusicShopWebServiceClient())
            {

                orders[] data = service.getAllOrders();

                listBoxOrders.Items.Clear();
                foreach (orders o in data)
                {
                    string isPaidDesc;
                    if (o.ordIsPaid.Equals("Y"))
                    {
                        isPaidDesc = "opłacone";
                    }
                    else
                    {
                        isPaidDesc = "nieopłacone";
                    }

                    string isCompletedDesc;
                    if (o.ordIsCompleted.Equals("Y"))
                    {
                        isCompletedDesc = "skompletowane";
                    }
                    else
                    {
                        isCompletedDesc = "nieopłacone";
                    }
                    listBoxOrders.Items.Add(o.ordId + " " + o.ordUsrId.usrFirstName + " " + o.ordUsrId.usrLastName + " " + o.ordTotalPrice + " " + isPaidDesc + " " + isCompletedDesc);
                }
            } 
        }

        private void addOrderButton_Click(object sender, EventArgs e)
        {
            using (MusicShopWebServiceClient service = new MusicShopWebServiceClient())
            {
                int orderId = int.Parse(orderIdBox.Text);
                string userLogin = userComboBox.Text;
                string productName = productComboBox.Text;
                DateTime orderDate = orderDatePicker.Value.Date;
                DateTime paymentDate = paymentDatePicker.Value.Date;
                DateTime completedDate = completedDatePicker.Value.Date;

                service.addNewOrder(orderId, userLogin, productName, orderDate, paymentDate, completedDate);

            }
        }

        private void addCategoryButton_Click(object sender, EventArgs e)
        {
            using (MusicShopWebServiceClient service = new MusicShopWebServiceClient())
            {
                int catId = int.Parse(idCategoryBox.Text);
                string catName = nameCategoryBox.Text;

                service.addNewCategory(catId, catName);

            }
        }
    }
}

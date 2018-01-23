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
                //product newProduct = new product();
                int productId = int.Parse(productIdBox.Text);
                string name = productNameBox.Text;
                int amount = int.Parse(productAmountBox.Text);
                int price = int.Parse(productPriceBox.Text);
                string description = productDescriptionBox.Text;
                //categories c = comboBoxCategories.Text;

                service.addNewProduct(productId, name, amount, price);

            }
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            
        }

        private void button4_Click(object sender, EventArgs e)
        {
            using (MusicShopWebServiceClient service = new MusicShopWebServiceClient())
            {
                categories[] data = service.getAllCategories();

                comboBoxCategories.Items.Clear();
                foreach (categories c in data)
                {
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
    }
}

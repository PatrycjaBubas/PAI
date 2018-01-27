namespace MusicShopClient
{
    partial class MShopClient
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.showProductsButton = new System.Windows.Forms.Button();
            this.productIdListBox = new System.Windows.Forms.TextBox();
            this.deleteProductButton = new System.Windows.Forms.Button();
            this.productIdListLabel = new System.Windows.Forms.Label();
            this.productIdBox = new System.Windows.Forms.TextBox();
            this.productIdLabel = new System.Windows.Forms.Label();
            this.productNameBox = new System.Windows.Forms.TextBox();
            this.productAmountBox = new System.Windows.Forms.TextBox();
            this.productPriceBox = new System.Windows.Forms.TextBox();
            this.productDescriptionBox = new System.Windows.Forms.TextBox();
            this.productNameLabel = new System.Windows.Forms.Label();
            this.productAmountLabel = new System.Windows.Forms.Label();
            this.productPriceLabel = new System.Windows.Forms.Label();
            this.productDescriptionabel = new System.Windows.Forms.Label();
            this.addProductButton = new System.Windows.Forms.Button();
            this.comboBoxCategories = new System.Windows.Forms.ComboBox();
            this.showCategoriesButton = new System.Windows.Forms.Button();
            this.allTabs = new System.Windows.Forms.TabControl();
            this.listOrDeleteProductTab = new System.Windows.Forms.TabPage();
            this.listBoxProducts = new System.Windows.Forms.ListBox();
            this.addProductTab = new System.Windows.Forms.TabPage();
            this.listCategoriesTab = new System.Windows.Forms.TabPage();
            this.listBoxCategories = new System.Windows.Forms.ListBox();
            this.addCategoryTab = new System.Windows.Forms.TabPage();
            this.categoryIdLabel = new System.Windows.Forms.Label();
            this.idCategoryBox = new System.Windows.Forms.TextBox();
            this.nameCategoryBox = new System.Windows.Forms.TextBox();
            this.addCategoryButton = new System.Windows.Forms.Button();
            this.categoryNameLabel = new System.Windows.Forms.Label();
            this.allTabs.SuspendLayout();
            this.listOrDeleteProductTab.SuspendLayout();
            this.addProductTab.SuspendLayout();
            this.listCategoriesTab.SuspendLayout();
            this.addCategoryTab.SuspendLayout();
            this.SuspendLayout();
            // 
            // showProductsButton
            // 
            this.showProductsButton.Location = new System.Drawing.Point(577, 35);
            this.showProductsButton.Name = "showProductsButton";
            this.showProductsButton.Size = new System.Drawing.Size(155, 35);
            this.showProductsButton.TabIndex = 1;
            this.showProductsButton.Text = "Pokaż produkty";
            this.showProductsButton.UseVisualStyleBackColor = true;
            this.showProductsButton.Click += new System.EventHandler(this.button1_Click);
            // 
            // productIdListBox
            // 
            this.productIdListBox.Location = new System.Drawing.Point(577, 382);
            this.productIdListBox.Name = "productIdListBox";
            this.productIdListBox.Size = new System.Drawing.Size(155, 22);
            this.productIdListBox.TabIndex = 2;
            // 
            // deleteProductButton
            // 
            this.deleteProductButton.Location = new System.Drawing.Point(577, 418);
            this.deleteProductButton.Name = "deleteProductButton";
            this.deleteProductButton.Size = new System.Drawing.Size(155, 31);
            this.deleteProductButton.TabIndex = 3;
            this.deleteProductButton.Text = "Usuń produkt";
            this.deleteProductButton.UseVisualStyleBackColor = true;
            this.deleteProductButton.Click += new System.EventHandler(this.button2_Click);
            // 
            // productIdListLabel
            // 
            this.productIdListLabel.AutoSize = true;
            this.productIdListLabel.Location = new System.Drawing.Point(587, 350);
            this.productIdListLabel.Name = "productIdListLabel";
            this.productIdListLabel.Size = new System.Drawing.Size(145, 17);
            this.productIdListLabel.TabIndex = 4;
            this.productIdListLabel.Text = "Identyfikator produktu";
            this.productIdListLabel.Click += new System.EventHandler(this.label1_Click);
            // 
            // productIdBox
            // 
            this.productIdBox.Location = new System.Drawing.Point(244, 52);
            this.productIdBox.Name = "productIdBox";
            this.productIdBox.Size = new System.Drawing.Size(155, 22);
            this.productIdBox.TabIndex = 5;
            // 
            // productIdLabel
            // 
            this.productIdLabel.AutoSize = true;
            this.productIdLabel.Location = new System.Drawing.Point(241, 32);
            this.productIdLabel.Name = "productIdLabel";
            this.productIdLabel.Size = new System.Drawing.Size(145, 17);
            this.productIdLabel.TabIndex = 6;
            this.productIdLabel.Text = "Identyfikator produktu";
            // 
            // productNameBox
            // 
            this.productNameBox.Location = new System.Drawing.Point(244, 104);
            this.productNameBox.Name = "productNameBox";
            this.productNameBox.Size = new System.Drawing.Size(155, 22);
            this.productNameBox.TabIndex = 7;
            // 
            // productAmountBox
            // 
            this.productAmountBox.Location = new System.Drawing.Point(244, 160);
            this.productAmountBox.Name = "productAmountBox";
            this.productAmountBox.Size = new System.Drawing.Size(155, 22);
            this.productAmountBox.TabIndex = 8;
            // 
            // productPriceBox
            // 
            this.productPriceBox.Location = new System.Drawing.Point(244, 218);
            this.productPriceBox.Name = "productPriceBox";
            this.productPriceBox.Size = new System.Drawing.Size(155, 22);
            this.productPriceBox.TabIndex = 9;
            this.productPriceBox.TextChanged += new System.EventHandler(this.productPriceBox_TextChanged);
            // 
            // productDescriptionBox
            // 
            this.productDescriptionBox.Location = new System.Drawing.Point(244, 279);
            this.productDescriptionBox.Multiline = true;
            this.productDescriptionBox.Name = "productDescriptionBox";
            this.productDescriptionBox.Size = new System.Drawing.Size(155, 55);
            this.productDescriptionBox.TabIndex = 10;
            // 
            // productNameLabel
            // 
            this.productNameLabel.AutoSize = true;
            this.productNameLabel.Location = new System.Drawing.Point(241, 84);
            this.productNameLabel.Name = "productNameLabel";
            this.productNameLabel.Size = new System.Drawing.Size(50, 17);
            this.productNameLabel.TabIndex = 11;
            this.productNameLabel.Text = "Nazwa";
            // 
            // productAmountLabel
            // 
            this.productAmountLabel.AutoSize = true;
            this.productAmountLabel.Location = new System.Drawing.Point(244, 140);
            this.productAmountLabel.Name = "productAmountLabel";
            this.productAmountLabel.Size = new System.Drawing.Size(36, 17);
            this.productAmountLabel.TabIndex = 12;
            this.productAmountLabel.Text = "Ilość";
            // 
            // productPriceLabel
            // 
            this.productPriceLabel.AutoSize = true;
            this.productPriceLabel.Location = new System.Drawing.Point(244, 198);
            this.productPriceLabel.Name = "productPriceLabel";
            this.productPriceLabel.Size = new System.Drawing.Size(41, 17);
            this.productPriceLabel.TabIndex = 13;
            this.productPriceLabel.Text = "Cena";
            this.productPriceLabel.Click += new System.EventHandler(this.label5_Click);
            // 
            // productDescriptionabel
            // 
            this.productDescriptionabel.AutoSize = true;
            this.productDescriptionabel.Location = new System.Drawing.Point(244, 256);
            this.productDescriptionabel.Name = "productDescriptionabel";
            this.productDescriptionabel.Size = new System.Drawing.Size(37, 17);
            this.productDescriptionabel.TabIndex = 14;
            this.productDescriptionabel.Text = "Opis";
            // 
            // addProductButton
            // 
            this.addProductButton.Location = new System.Drawing.Point(244, 459);
            this.addProductButton.Name = "addProductButton";
            this.addProductButton.Size = new System.Drawing.Size(155, 43);
            this.addProductButton.TabIndex = 15;
            this.addProductButton.Text = "Dodaj produkt";
            this.addProductButton.UseVisualStyleBackColor = true;
            this.addProductButton.Click += new System.EventHandler(this.button3_Click);
            // 
            // comboBoxCategories
            // 
            this.comboBoxCategories.FormattingEnabled = true;
            this.comboBoxCategories.Location = new System.Drawing.Point(244, 374);
            this.comboBoxCategories.Name = "comboBoxCategories";
            this.comboBoxCategories.Size = new System.Drawing.Size(155, 24);
            this.comboBoxCategories.TabIndex = 16;
            this.comboBoxCategories.SelectedIndexChanged += new System.EventHandler(this.comboBox1_SelectedIndexChanged);
            // 
            // showCategoriesButton
            // 
            this.showCategoriesButton.Location = new System.Drawing.Point(578, 40);
            this.showCategoriesButton.Name = "showCategoriesButton";
            this.showCategoriesButton.Size = new System.Drawing.Size(129, 43);
            this.showCategoriesButton.TabIndex = 17;
            this.showCategoriesButton.Text = "Pokaż kategorie";
            this.showCategoriesButton.UseVisualStyleBackColor = true;
            this.showCategoriesButton.Click += new System.EventHandler(this.button4_Click);
            // 
            // allTabs
            // 
            this.allTabs.Controls.Add(this.listOrDeleteProductTab);
            this.allTabs.Controls.Add(this.addProductTab);
            this.allTabs.Controls.Add(this.listCategoriesTab);
            this.allTabs.Controls.Add(this.addCategoryTab);
            this.allTabs.Location = new System.Drawing.Point(0, 0);
            this.allTabs.Name = "allTabs";
            this.allTabs.SelectedIndex = 0;
            this.allTabs.Size = new System.Drawing.Size(760, 673);
            this.allTabs.TabIndex = 18;
            // 
            // listOrDeleteProductTab
            // 
            this.listOrDeleteProductTab.Controls.Add(this.listBoxProducts);
            this.listOrDeleteProductTab.Controls.Add(this.showProductsButton);
            this.listOrDeleteProductTab.Controls.Add(this.productIdListBox);
            this.listOrDeleteProductTab.Controls.Add(this.productIdListLabel);
            this.listOrDeleteProductTab.Controls.Add(this.deleteProductButton);
            this.listOrDeleteProductTab.Location = new System.Drawing.Point(4, 25);
            this.listOrDeleteProductTab.Name = "listOrDeleteProductTab";
            this.listOrDeleteProductTab.Padding = new System.Windows.Forms.Padding(3);
            this.listOrDeleteProductTab.Size = new System.Drawing.Size(752, 644);
            this.listOrDeleteProductTab.TabIndex = 0;
            this.listOrDeleteProductTab.Text = "Wyświetl produkty / Usuń produkt";
            this.listOrDeleteProductTab.UseVisualStyleBackColor = true;
            // 
            // listBoxProducts
            // 
            this.listBoxProducts.FormattingEnabled = true;
            this.listBoxProducts.ItemHeight = 16;
            this.listBoxProducts.Location = new System.Drawing.Point(3, 22);
            this.listBoxProducts.Name = "listBoxProducts";
            this.listBoxProducts.Size = new System.Drawing.Size(542, 596);
            this.listBoxProducts.TabIndex = 1;
            // 
            // addProductTab
            // 
            this.addProductTab.Controls.Add(this.productIdLabel);
            this.addProductTab.Controls.Add(this.productIdBox);
            this.addProductTab.Controls.Add(this.comboBoxCategories);
            this.addProductTab.Controls.Add(this.productNameBox);
            this.addProductTab.Controls.Add(this.addProductButton);
            this.addProductTab.Controls.Add(this.productAmountBox);
            this.addProductTab.Controls.Add(this.productDescriptionabel);
            this.addProductTab.Controls.Add(this.productPriceBox);
            this.addProductTab.Controls.Add(this.productPriceLabel);
            this.addProductTab.Controls.Add(this.productDescriptionBox);
            this.addProductTab.Controls.Add(this.productAmountLabel);
            this.addProductTab.Controls.Add(this.productNameLabel);
            this.addProductTab.Location = new System.Drawing.Point(4, 25);
            this.addProductTab.Name = "addProductTab";
            this.addProductTab.Padding = new System.Windows.Forms.Padding(3);
            this.addProductTab.Size = new System.Drawing.Size(752, 644);
            this.addProductTab.TabIndex = 1;
            this.addProductTab.Text = "Dodaj produkt";
            this.addProductTab.UseVisualStyleBackColor = true;
            // 
            // listCategoriesTab
            // 
            this.listCategoriesTab.Controls.Add(this.listBoxCategories);
            this.listCategoriesTab.Controls.Add(this.showCategoriesButton);
            this.listCategoriesTab.Location = new System.Drawing.Point(4, 25);
            this.listCategoriesTab.Name = "listCategoriesTab";
            this.listCategoriesTab.Padding = new System.Windows.Forms.Padding(3);
            this.listCategoriesTab.Size = new System.Drawing.Size(752, 644);
            this.listCategoriesTab.TabIndex = 2;
            this.listCategoriesTab.Text = "Kategorie";
            this.listCategoriesTab.UseVisualStyleBackColor = true;
            // 
            // listBoxCategories
            // 
            this.listBoxCategories.FormattingEnabled = true;
            this.listBoxCategories.ItemHeight = 16;
            this.listBoxCategories.Location = new System.Drawing.Point(8, 19);
            this.listBoxCategories.Name = "listBoxCategories";
            this.listBoxCategories.Size = new System.Drawing.Size(542, 596);
            this.listBoxCategories.TabIndex = 18;
            // 
            // addCategoryTab
            // 
            this.addCategoryTab.Controls.Add(this.categoryIdLabel);
            this.addCategoryTab.Controls.Add(this.idCategoryBox);
            this.addCategoryTab.Controls.Add(this.nameCategoryBox);
            this.addCategoryTab.Controls.Add(this.addCategoryButton);
            this.addCategoryTab.Controls.Add(this.categoryNameLabel);
            this.addCategoryTab.Location = new System.Drawing.Point(4, 25);
            this.addCategoryTab.Name = "addCategoryTab";
            this.addCategoryTab.Padding = new System.Windows.Forms.Padding(3);
            this.addCategoryTab.Size = new System.Drawing.Size(752, 644);
            this.addCategoryTab.TabIndex = 3;
            this.addCategoryTab.Text = "Dodaj kategorię";
            this.addCategoryTab.UseVisualStyleBackColor = true;
            // 
            // categoryIdLabel
            // 
            this.categoryIdLabel.AutoSize = true;
            this.categoryIdLabel.Location = new System.Drawing.Point(266, 151);
            this.categoryIdLabel.Name = "categoryIdLabel";
            this.categoryIdLabel.Size = new System.Drawing.Size(135, 17);
            this.categoryIdLabel.TabIndex = 17;
            this.categoryIdLabel.Text = "Identyfikator kategrii";
            this.categoryIdLabel.Click += new System.EventHandler(this.label7_Click);
            // 
            // idCategoryBox
            // 
            this.idCategoryBox.Location = new System.Drawing.Point(269, 171);
            this.idCategoryBox.Name = "idCategoryBox";
            this.idCategoryBox.RightToLeft = System.Windows.Forms.RightToLeft.Yes;
            this.idCategoryBox.Size = new System.Drawing.Size(155, 22);
            this.idCategoryBox.TabIndex = 16;
            this.idCategoryBox.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // nameCategoryBox
            // 
            this.nameCategoryBox.Location = new System.Drawing.Point(269, 223);
            this.nameCategoryBox.Name = "nameCategoryBox";
            this.nameCategoryBox.RightToLeft = System.Windows.Forms.RightToLeft.Yes;
            this.nameCategoryBox.Size = new System.Drawing.Size(155, 22);
            this.nameCategoryBox.TabIndex = 18;
            this.nameCategoryBox.TextChanged += new System.EventHandler(this.textBox2_TextChanged);
            // 
            // addCategoryButton
            // 
            this.addCategoryButton.Location = new System.Drawing.Point(269, 360);
            this.addCategoryButton.Name = "addCategoryButton";
            this.addCategoryButton.Size = new System.Drawing.Size(155, 43);
            this.addCategoryButton.TabIndex = 20;
            this.addCategoryButton.Text = "Dodaj kategorię";
            this.addCategoryButton.UseVisualStyleBackColor = true;
            // 
            // categoryNameLabel
            // 
            this.categoryNameLabel.AutoSize = true;
            this.categoryNameLabel.Location = new System.Drawing.Point(266, 203);
            this.categoryNameLabel.Name = "categoryNameLabel";
            this.categoryNameLabel.RightToLeft = System.Windows.Forms.RightToLeft.Yes;
            this.categoryNameLabel.Size = new System.Drawing.Size(50, 17);
            this.categoryNameLabel.TabIndex = 19;
            this.categoryNameLabel.Text = "Nazwa";
            this.categoryNameLabel.Click += new System.EventHandler(this.label8_Click);
            // 
            // MShopClient
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(761, 670);
            this.Controls.Add(this.allTabs);
            this.Name = "MShopClient";
            this.Text = "Music Shop Cilent";
            this.allTabs.ResumeLayout(false);
            this.listOrDeleteProductTab.ResumeLayout(false);
            this.listOrDeleteProductTab.PerformLayout();
            this.addProductTab.ResumeLayout(false);
            this.addProductTab.PerformLayout();
            this.listCategoriesTab.ResumeLayout(false);
            this.addCategoryTab.ResumeLayout(false);
            this.addCategoryTab.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button showProductsButton;
        private System.Windows.Forms.TextBox productIdListBox;
        private System.Windows.Forms.Button deleteProductButton;
        private System.Windows.Forms.Label productIdListLabel;
        private System.Windows.Forms.TextBox productIdBox;
        private System.Windows.Forms.Label productIdLabel;
        private System.Windows.Forms.TextBox productNameBox;
        private System.Windows.Forms.TextBox productAmountBox;
        private System.Windows.Forms.TextBox productPriceBox;
        private System.Windows.Forms.TextBox productDescriptionBox;
        private System.Windows.Forms.Label productNameLabel;
        private System.Windows.Forms.Label productAmountLabel;
        private System.Windows.Forms.Label productPriceLabel;
        private System.Windows.Forms.Label productDescriptionabel;
        private System.Windows.Forms.Button addProductButton;
        private System.Windows.Forms.ComboBox comboBoxCategories;
        private System.Windows.Forms.Button showCategoriesButton;
        private System.Windows.Forms.TabControl allTabs;
        private System.Windows.Forms.TabPage listOrDeleteProductTab;
        private System.Windows.Forms.ListBox listBoxProducts;
        private System.Windows.Forms.TabPage addProductTab;
        private System.Windows.Forms.TabPage listCategoriesTab;
        private System.Windows.Forms.ListBox listBoxCategories;
        private System.Windows.Forms.TabPage addCategoryTab;
        private System.Windows.Forms.Label categoryIdLabel;
        private System.Windows.Forms.TextBox idCategoryBox;
        private System.Windows.Forms.TextBox nameCategoryBox;
        private System.Windows.Forms.Button addCategoryButton;
        private System.Windows.Forms.Label categoryNameLabel;
    }
}


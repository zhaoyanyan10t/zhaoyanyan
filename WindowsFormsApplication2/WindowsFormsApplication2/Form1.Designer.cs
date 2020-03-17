namespace WindowsFormsApplication2
{
    partial class Form1
    {
        /// <summary>
        /// 必需的设计器变量。
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 清理所有正在使用的资源。
        /// </summary>
        /// <param name="disposing">如果应释放托管资源，为 true；否则为 false。</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows 窗体设计器生成的代码

        /// <summary>
        /// 设计器支持所需的方法 - 不要
        /// 使用代码编辑器修改此方法的内容。
        /// </summary>
        private void InitializeComponent()
        {
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.stuXH = new System.Windows.Forms.TextBox();
            this.stuXM = new System.Windows.Forms.TextBox();
            this.stuZY = new System.Windows.Forms.ComboBox();
            this.search_btn = new System.Windows.Forms.Button();
            this.StuDGV = new System.Windows.Forms.DataGridView();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.StuDGV)).BeginInit();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.StuDGV);
            this.groupBox1.Controls.Add(this.search_btn);
            this.groupBox1.Controls.Add(this.stuZY);
            this.groupBox1.Controls.Add(this.stuXM);
            this.groupBox1.Controls.Add(this.stuXH);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Location = new System.Drawing.Point(92, 28);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(600, 360);
            this.groupBox1.TabIndex = 0;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "输入查询条件";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(6, 37);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(52, 15);
            this.label1.TabIndex = 0;
            this.label1.Text = "学号：";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(161, 37);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(52, 15);
            this.label2.TabIndex = 1;
            this.label2.Text = "姓名：";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(334, 37);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(52, 15);
            this.label3.TabIndex = 2;
            this.label3.Text = "专业：";
            // 
            // stuXH
            // 
            this.stuXH.Location = new System.Drawing.Point(49, 34);
            this.stuXH.Name = "stuXH";
            this.stuXH.Size = new System.Drawing.Size(100, 25);
            this.stuXH.TabIndex = 3;
            // 
            // stuXM
            // 
            this.stuXM.Location = new System.Drawing.Point(220, 33);
            this.stuXM.Name = "stuXM";
            this.stuXM.Size = new System.Drawing.Size(100, 25);
            this.stuXM.TabIndex = 4;
            // 
            // stuZY
            // 
            this.stuZY.FormattingEnabled = true;
            this.stuZY.Location = new System.Drawing.Point(381, 33);
            this.stuZY.Name = "stuZY";
            this.stuZY.Size = new System.Drawing.Size(121, 23);
            this.stuZY.TabIndex = 5;
            this.stuZY.DropDownStyleChanged += new System.EventHandler(this.查询);
            // 
            // search_btn
            // 
            this.search_btn.Location = new System.Drawing.Point(519, 32);
            this.search_btn.Name = "search_btn";
            this.search_btn.Size = new System.Drawing.Size(75, 23);
            this.search_btn.TabIndex = 6;
            this.search_btn.Text = "查询";
            this.search_btn.UseVisualStyleBackColor = true;
            this.search_btn.Click += new System.EventHandler(this.查询);
            // 
            // StuDGV
            // 
            this.StuDGV.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.StuDGV.Location = new System.Drawing.Point(39, 90);
            this.StuDGV.Name = "StuDGV";
            this.StuDGV.RowTemplate.Height = 27;
            this.StuDGV.Size = new System.Drawing.Size(525, 243);
            this.StuDGV.TabIndex = 7;
            this.StuDGV.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView1_CellContentClick);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(732, 421);
            this.Controls.Add(this.groupBox1);
            this.Name = "Form1";
            this.Text = "学生信息查询";
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.StuDGV)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Button search_btn;
        private System.Windows.Forms.ComboBox stuZY;
        private System.Windows.Forms.TextBox stuXM;
        private System.Windows.Forms.TextBox stuXH;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.DataGridView StuDGV;
    }
}


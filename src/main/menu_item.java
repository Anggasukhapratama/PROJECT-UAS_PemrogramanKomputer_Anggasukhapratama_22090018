/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author ASUS
 */
public class menu_item extends javax.swing.JPanel {

    /**
     * @return the subMenu
     */
    public ArrayList<menu_item> getSubMenu() {
        return subMenu;
    }

 private final ArrayList<menu_item> subMenu = new ArrayList<>();

    
    private ActionListener act;
     
   public menu_item(Icon icon, boolean sbm, Icon iconSub, String menu, ActionListener act,menu_item... subMenu) {
    initComponents();
    lb_icon.setIcon(icon);
    lb_menu.setText(menu);
    lb_iconSub.setIcon(iconSub);
    lb_iconSub.setVisible(sbm);
    try {
        if (act != null){
            this.act = act;
        }
        this.setSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMinimumSize(new Dimension(Integer.MAX_VALUE, 45));
        for (int i = 0; i < subMenu.length; i++) {
            this.subMenu.add(subMenu[i]);
            subMenu[i].setVisible(false);
        }
    } catch (Exception e) {
        // Exception handling code can be added here
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_icon = new javax.swing.JLabel();
        lb_iconSub = new javax.swing.JLabel();
        lb_menu = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        lb_menu.setText("MenuItem...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_iconSub, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_icon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(lb_iconSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
private boolean showing =false;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        setBackground(new java.awt.Color(255,255,255));
    // Remove boolean declaration
    // boolean showing = false;
    // TODO add your handling code here:
    if (showing) {
        hideMenu();
        showing = false; // Update showing here
    } else {
        showMenu();
        showing = true; // Update showing here
    }
    if (act != null){
        act.actionPerformed(null);
    } 
        
    }//GEN-LAST:event_formMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_icon;
    private javax.swing.JLabel lb_iconSub;
    private javax.swing.JLabel lb_menu;
    // End of variables declaration//GEN-END:variables

 private void hideMenu() {
    new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = subMenu.size() - 1; i >= 0; i--) {
                try {
                    Thread.sleep(20); // Sleep for 20 milliseconds
                } catch (InterruptedException e) {
                    // Handle the exception appropriately
                }
                subMenu.get(i).setVisible(false);
                subMenu.get(i).hideMenu();
            }            showing = false;
            getParent().repaint();
            getParent().revalidate();
        }
    }).start();
}

private void showMenu() {
    new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < subMenu.size(); i++) {
                try {
                    Thread.sleep(20); // Sleep for 20 milliseconds
                } catch (InterruptedException e) {
                    // Handle the exception appropriately
                }
                subMenu.get(i).setVisible(true);
                subMenu.get(i).showMenu(); // Recursively show submenus
            }
            showing = true;
            getParent().repaint();
            getParent().revalidate();
        }
    }).start();
}
private void sleep(){
    try {
        
       thread.sleep(20);
    } catch (Exception e) {
    }
}
}
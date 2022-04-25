# -*- coding: utf-8 -*-
from odoo import api, fields, models

class musicstore_actualizar_stock(models.TransientModel):
    _name  = "js.musicstore.actualizar.stock"

    active_instrumento_ids = fields.Many2many("js.musicstore.instrumento",string="Instrumentos")
    stock_new = fields.Integer(string="Stock")

    @api.model
    def default_get(self, fields_list):
        res = super(musicstore_actualizar_stock,self).default_get(fields_list)
        active_ids = self.env.context.get("active_ids")
        if "active_ids":
            res["active_instrumento_ids"] = [(6,0,active_ids)]

            return res

    def actualizar_stock(self):
        if self.stock_new:
            self.active_instrumento_ids.write({'stock': self.stock_new})
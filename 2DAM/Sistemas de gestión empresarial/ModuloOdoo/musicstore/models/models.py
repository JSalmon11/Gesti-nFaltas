# -*- coding: utf-8 -*-
import string
from odoo import models, fields, api
class MusicstoreFamilia(models.Model):
    _name = "js.musicstore.familia"

    name = fields.Char(string="Nombre",required=True,help="Introduce el nombre de la familia")
    description = fields.Text(string="Descripción")
    categoria_ids = fields.One2many("js.musicstore.categoria","familia_id",string="Categorías")

class MusicstoreCategoria(models.Model):
    _name = "js.musicstore.categoria"

    name = fields.Char(string="Nombre",required=True,help="Introduce el nombre de la categoria")
    description = fields.Text(string="Descripción")
    familia_id = fields.Many2one("js.musicstore.familia",string="Familia",required=True,ondelete="cascade")
    instrumento_ids = fields.One2many("js.musicstore.instrumento","categoria_id",string="Instrumentos")

class MusicstoreInstrumento(models.Model):
    _name = "js.musicstore.instrumento"

    name = fields.Char(string="Instrumento",required=True,help="Introduce el instrumento")
    precio = fields.Float(string="Precio")
    ejemplares = fields.Integer(string="Stock")
    fecha_compra = fields.Date(string="Fecha de compra")
    fecha_venta = fields.Date(string="Fecha de venta")
    categoria_id = fields.Many2one("js.musicstore.categoria",string="Categoría",required=True,ondelete="cascade")
    imagen = fields.Image(store=True,relation="res.partner",help="Seleccionar imagen aquí")
    
class MusicstoreCliente(models.Model):
    _name = "js.musicstore.cliente"
    _description = "Clientes de la  tienda de instrumentos"

    name = fields.Char(string="Nombre",  required=True)
    active = fields.Boolean(string="Cliente activo", default=True)
    country_id =  fields.Many2one("res.country", string="País")
    instrumento_ids = fields.Many2many("js.musicstore.instrumento",string="Instrumentos comprados")
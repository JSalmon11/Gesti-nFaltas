# -*- coding: utf-8 -*-
{
    'name': "Tienda de Instrumentos",

    'summary': "Gestión de una tienda de Instrumentos",

    'author': "Jorge Salmón",
    'website': "http://www.instrumentosonline.com",

    # Categories can be used to filter modules in modules listing
    # Check https://github.com/odoo/odoo/blob/14.0/odoo/addons/base/data/ir_module_category_data.xml
    # for the full list
    'category': 'no',
    'version': '1.0',

    # any module necessary for this one to work correctly
    'depends': ['base'],

    # always loaded
    'data': [
        'data/data.xml',
        'security/security.xml',
        'security/ir.model.access.csv',
        'views/views.xml',
        'wizard/actualizar_stock.xml'
    ],
    "application": True
}

# -*- coding: utf-8 -*-
# Generated by Django 1.10.5 on 2020-02-28 18:22
from __future__ import unicode_literals

import datetime
from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('foodspark', '0007_auto_20200227_2232'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='restaurant',
            name='image',
        ),
        migrations.AlterField(
            model_name='fooditem',
            name='image',
            field=models.ImageField(null=True, upload_to=b''),
        ),
        migrations.AlterField(
            model_name='order',
            name='ordertime',
            field=models.TimeField(default=datetime.datetime(2017, 2, 28, 23, 52, 26, 899271)),
        ),
    ]

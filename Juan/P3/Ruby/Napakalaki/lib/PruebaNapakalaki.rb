#encoding: utf-8

#Versión 3.0

require_relative 'BadConsequence.rb'
require_relative 'Monster.rb'
require_relative 'TreasureKind.rb'
require_relative 'Prize.rb'
require_relative 'Napakalaki.rb'
require_relative 'CombatResult.rb'
#monsters = Array.new
# PRÁCTICA 1
## Monstrous
#
#
## 3 Byakhees de bonanza
#
#price = Prize.new(2,1)
#badconsequence = BadConsequence.newLevelSpecificTreasures('Pierdes tu armadura visible y otra oculta',0,[TreasureKind::ARMOR],[TreasureKind::ARMOR])
#monsters << Monster.new('3 Byakhees de bonanza',8,badconsequence,price)
#  
## Chibithulhu
#  
#price = Prize.new(1,1)
#badconsequence = BadConsequence.newLevelSpecificTreasures('Embobados don el lindo primigenio te descartas de tu casco visible',0,[TreasureKind::HELMET],[])
#monsters << Monster.new('Chibithulhu',2,badconsequence,price)
#
## El sopor de Dunwich
#
#price = Prize.new(1,1)
#badconsequence = BadConsequence.newLevelSpecificTreasures('El primordial bostezo contagioso. Pierdes el calzado visible',0,[TreasureKind::SHOES],[])
#monsters << Monster.new('El sopor de Dunwich',2,badconsequence,price)
#
#
## Ángeles de la noche ibicenca
#
#price = Prize.new(4,1)
#badconsequence = BadConsequence.newLevelSpecificTreasures('Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible y  1 mano oculta',0 ,[TreasureKind::ONEHAND],[TreasureKind::ONEHAND])
#monsters << Monster.new('Angeles de la noche ibicenca',14,badconsequence,price)
#
## El gorrón en el umbral
#
#price = Prize.new(3,1)
#badconsequence = BadConsequence.newLevelNumberOfTreasures('El gorron en el umbral',0,10,0)
#monsters << Monster.new('El gorron en el umbra',10,badconsequence,price)
#
## H.P. Munchcraft
#
#price = Prize.new(2,1)
#badconsequence = BadConsequence.newLevelSpecificTreasures('Pierdes la armadura visible',0,[TreasureKind::ARMOR],[])
#monsters << Monster.new('H.P. Munchcraft',6,badconsequence,price)
#
## Bichgooth
#
#price = Prize.new(1,1)
#badconsequence = BadConsequence.newLevelSpecificTreasures('Sientes bichos bajo la ropa. Descarta la armadura visible',0,[TreasureKind::ARMOR] , [] )
#monsters << Monster.new('Bichgooth',2,badconsequence,price)
#
#
## El rey de rosa
#
#price = Prize.new(4,2)
#badconsequence = BadConsequence.newLevelNumberOfTreasures('Pierdes 5 niveles y 3 tesoros visibles', 5, 3, 0)
#monsters << Monster.new('El rey de rosa',13,badconsequence,price)
#
## La que redacta en las tinieblas
#
#price = Prize.new(1,1)
#badconsequence = BadConsequence.newLevelNumberOfTreasures('Toses los pulmones y pierdes 2 niveles',2,0,0)
#monsters << Monster.new('La que redacta en las tinieblas',2,badconsequence,price)
#
## Los hondos
#
#price = Prize.new(2,1)
#badconsequence = BadConsequence.newDeath("Estos monstruos resultan bastante superficiales y te aburren mortalmente. Estas muerto")
#monsters << Monster.new('Los hondos',8,badconsequence,price)
#
## Semillas Cthulhu
#
#price = Prize.new(2,1)
#badconsequence = BadConsequence.newLevelNumberOfTreasures('Pierdes 2 niveles y 2 tesoros ocultos',2,0,2)
#monsters << Monster.new('Semillas Cthulhu',4,badconsequence,price)
#
## Dameargo
#
#price = Prize.new(2,1)
#badconsequence = BadConsequence.newLevelSpecificTreasures('Te intentas escaquear. Pierdes una mano visible',0,[TreasureKind::ONEHAND],[])
#monsters << Monster.new('Dameargo',1,badconsequence,price)
#
## Pollipólipo volante
#
#price = Prize.new(1,1)
#badconsequence = BadConsequence.newLevelNumberOfTreasures('Da mucho asquito. Pierdes 3 niveles.',3,0,0)
#monsters << Monster.new('Pollipolipo volante',3,badconsequence,price)
#
## Yskhtihyssg-Goth
#
#price = Prize.new(3,1)
#badconsequence = BadConsequence.newDeath('No le hace gracia que pronuncien mal su nombre. Estas muerto')
#monsters << Monster.new('Yskhtihyssg-Goth',12,badconsequence,price)
#
## Familia feliz
#
#price = Prize.new(4,1)
#badconsequence = BadConsequence.newDeath("La familia te atrapa. Estas muerto")
#monsters << Monster.new('Familia feliz',1,badconsequence, price)
#
## Roboggoth
#price = Prize.new(2,1)
#badconsequence = BadConsequence.newLevelSpecificTreasures('La quinta directeiva primaria te obliga a perder 2 niveles y un tesoro, 2 manos visibles.',2,[TreasureKind::BOTHHANDS],[])
#monsters << Monster.new('Roboggoth',8,badconsequence,price)
#
## El espía
#
#price = Prize.new(1,1)
#badconsequence = BadConsequence.newLevelSpecificTreasures('Te asusta en la noche. Pierdes un casco visible',0,[TreasureKind::HELMET],[])
#monsters << Monster.new('El espia',5,badconsequence,price)
#
## El Lenguas
#
#price = Prize.new(1,1)
#badconsequence = BadConsequence.newLevelNumberOfTreasures('Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles',2, 5,0)
#monsters << Monster.new('El Lenguas',20,badconsequence,price)
#
## Bicéfalo
#
#price = Prize.new(1,1)
#badconsequence = BadConsequence.newLevelSpecificTreasures('Te faltan manos para tanta cabeza. Pierdes 3 niveles y tus tesoros visibles de las manos',3,[TreasureKind::ONEHAND,TreasureKind::ONEHAND,TreasureKind::BOTHHANDS],[])
#monsters << Monster.new('Bicefalo',20,badconsequence,price)
#
##Bucle para imprimir el array de monstruos
#i = 0
##while i < monsters.size
##    puts monsters.fetch(i)
##    i = i+1
##end
#
##Mostrar todos los monstruos que tengan un nivel de combate superior a 10.
#num = 0
#puts "Todos los monstruos que tenga un vivel de combate superior a 10"+"\n\n"
#while i < monsters.size    
#    if (monsters.fetch(i).combatLevel > 10)
#        puts monsters.fetch(i)
#       num = num+1
#    end 
#    i = i+1
#end
#puts "\n"
## Mostrar todos los monstruos que tengan un mal rollo que implique sólo pérdida de niveles.
#
#i=0
#num =0
#puts "Todos los monstruos que tengan un mal rollo que implique solo perdida de niveles"+"\n\n"
#while i < monsters.size
#    
#    auxiliar = monsters[i].badconsequence.levels
#    
#    if(auxiliar > 0)
#        puts monsters.fetch(i)
#        num = num + 1
#    end
#    i = i+1
#end
#puts "\n"
## Mostrar todos los monstruos que tengan un buen rollo que indique una ganancia de
## niveles superior a 1.
#
#i=0
#num =0
#puts "Todos los monstruos que tengan un buen rollo que indique una gananacia de niveles superior a 1"+"\n\n"
#
#while i < monsters.size
#    auxiliar = monsters.fetch(i).price.levels #método get para acceder al elemento en la posición i
#    
#        if (auxiliar > 1)
#            puts monsters.fetch(i) 
#           num = num+1
#        end
#    i = i+1
#end
#puts "\n"
##Mostrar todos los monstruos que tengan un mal rollo que suponga la pérdida de un
##determinado tipo de tesoros ya sea visibles y/o ocultos. Debe mostrarse el
##nombre, nivel de combate, buen rollo y mal rollo de cada monstruo.
#i=0
#num = 0
#puts "Todos los monstruos que tengan un mal rollo que suponga la pérdida de un determinado tipo de tesoros ya sea visible y/o ocultos"+"\n\n"
#while i < monsters.size
#    specificV = monsters.fetch(i).badconsequence.specificVisibleTreasures
#    specificH = monsters.fetch(i).badconsequence.specificHiddenTreasures
#    
#    if (specificV != [] || specificH != [])
#        puts monsters.fetch(i)
#        num = num+1
#    end
#    i = i+1
#end
#puts "\n"
#
##Imprimimos el número de monstrous
#puts "Total monstrous: #{num}"


napa = Napakalaki.instance
res = [CombatResult::LOSE]
#res = [CombatResult::WINGAME]
puts napa.endOfGame(res)

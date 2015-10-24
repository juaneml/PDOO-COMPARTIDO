# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
#encoding: utf-8

require_relative 'BadConsequence.rb'
require_relative 'Monster.rb'
require_relative 'TreasureKind.rb'
require_relative 'Prize.rb'

#Creación de prueba
@bc=BadConsequence.newLevelNumberOfTreasures("se pilla los dedos en la puerta", 15,2, 2)
@prize=Prize.new(7,4)
@m=Monster.new("caca",19,@bc,@prize)

#muestra el objeto monster
puts @m

#Implementación de código de la práctica

@monsters = Array.new

@price = Prize.new(4,2)
@badConsequence =BadConsequence.newLevelNumberOfTreasures('Pierdes 5 niveles y 3 tesoros visibles',5 , 3, 0)
@monsters << Monster.new('El rey de rosa',13,@price,@badConsequence)

@price = Prize.new(4,1)
@badConsequence = BadConsequence.newLevelSpecificTreasures('Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta', 0,[TreasureKind::ONEHAND],[TreasureKind::ONEHAND])
@monsters<< Monster.new('Angeles de la noche ibicenca', 14, @price, @badConsequence)

@price = Prize.new(2,1)
@badConsequence = BadConsequence.newLevelSpecificTreasures('Pierdes tu armadura visible y otra oculta', 0,[TreasureKind::ARMOR],[TreasureKind::ARMOR])
@monsters<< Monster.new('3 Byakhees de bonanza', 8, @price, @badConsequence)

@price = Prize.new(1,1)
@badConsequence = BadConsequence.newLevelSpecificTreasures('Embobados con el lindo primigenio te descartas de tu casco visible', 0,[TreasureKind::HELMET],[])
@monsters<< Monster.new('Chibithulhu', 2, @price, @badConsequence)

@price = Prize.new(1,1)
@badConsequence = BadConsequence.newLevelSpecificTreasures('El primordial bostezo contagioso. Pierdes el calzado visible', 0,[TreasureKind::SHOES],[])
@monsters<< Monster.new('El sopor de Dunwich', 2, @price, @badConsequence)

@price = Prize.new(3,1)
@badConsequence = BadConsequence.newLevelNumberOfTreasures('Pierdes todos tus tesoros visibles', 0,10,0)
@monsters<< Monster.new('El gorron en el umbral', 10, @price, @badConsequence)

@price = Prize.new(2,1)
@badConsequence = BadConsequence.newLevelSpecificTreasures('Pierdes la armadura visible', 0,[TreasureKind::ARMOR],[])
@monsters<< Monster.new('H.P. Munchcraft', 10, @price, @badConsequence)

@price = Prize.new(1,1)
@badConsequence = BadConsequence.newLevelSpecificTreasures('Sientes bichos bajo la ropa. Descarta la armadura visible', 0,[TreasureKind::ARMOR],[])
@monsters<< Monster.new('Bichgooth', 2, @price, @badConsequence)

@price = Prize.new(1,1)
@badConsequence = BadConsequence.newLevelNumberOfTreasures('Toses los pulmones y pierdes 2 niveles', 2,0,0)
@monsters<< Monster.new('La que redacta en las tinieblas', 2, @price, @badConsequence)

@price = Prize.new(2,1)
@badConsequence = BadConsequence.newDeath('Estos monstruos resultan bastante superficiales y te aburren mortalmente. Estas muerto')
@monsters<< Monster.new('Los hondos', 8, @price, @badConsequence)

@price = Prize.new(2,1)
@badConsequence = BadConsequence.newLevelNumberOfTreasures('Pierdes 2 niveles y 2 tesoros ocultos', 2,0,2)
@monsters<< Monster.new('Semillas Cthulhu', 4, @price, @badConsequence)

@price = Prize.new(2,1)
@badConsequence = BadConsequence.newLevelSpecificTreasures('Te intentas escaquear. Pierdes una mano visible', 2,[TreasureKind::ONEHAND],[])
@monsters<< Monster.new('Dameargo', 1, @price, @badConsequence)

@price = Prize.new(1,1)
@badConsequence = BadConsequence.newLevelNumberOfTreasures('Da mucho asquito. Pierdes 3 niveles', 3,0,0)
@monsters<< Monster.new('Pollipolipo volante', 3, @price, @badConsequence)

@price = Prize.new(3,1)
@badConsequence = BadConsequence.newDeath('No le hace gracia que pronuncien mal su nombre. Estas muerto')
@monsters<< Monster.new('YskhtihyssgGoth', 12, @price, @badConsequence)

@price = Prize.new(4,1)
@badConsequence = BadConsequence.newDeath('La familia te atrapa. Estas muerto.')
@monsters<< Monster.new('Familia feliz', 1, @price, @badConsequence)

@price = Prize.new(2,1)
@badConsequence = BadConsequence.newLevelSpecificTreasures('La quinta directiva primaria te obliga a perder 2 niveles y un tesoro 2 manos visible', 0,[TreasureKind::BOTHHANDS],[])
@monsters<< Monster.new('Roboggoth', 8, @price, @badConsequence)

@price = Prize.new(1,1)
@badConsequence = BadConsequence.newLevelSpecificTreasures('Te asusta en la noche.Pierdes un casco visible.', 0,[TreasureKind::ARMOR],[])
@monsters<< Monster.new('El espia', 5, @price, @badConsequence)

@price = Prize.new(1,1)
@badConsequence = BadConsequence.newLevelNumberOfTreasures('Menudo susto te llevas.Pierdes 2 niveles y 5 tesoros visibles.', 2,5,0)
@monsters<< Monster.new('El Lenguas', 20, @price, @badConsequence)

@price = Prize.new(1,1)
@badConsequence = BadConsequence.newLevelSpecificTreasures('Te faltan manos para tanta cabeza. Pierdes 3 niveles y tus tesoros visibles de las manos', 3,[TreasureKind::BOTHHANDS,TreasureKind::ONEHAND,TreasureKind::ONEHAND],[])
@monsters<< Monster.new('Bicefalo', 20, @price, @badConsequence)

puts "Lista de Monstruos Completa"
puts @monsters



#x=1
#if x > 2
#   puts "x is greater than 2"
#elsif x <= 2 and x!=0
#   puts "x is 1"
#else
#   puts "I can't guess the number"
#end

puts "\nMOSTRAR TOROS LOS MONSTRUOS QUE TENGAN UN NIVEL DE COMBATE SUPERIOR A 10"

@monsters.each do |monstruo|
  if monstruo.combatLevel > 10
    puts "\nMonstruo: #{monstruo}"
  end
end
    

puts "\nMOSTRAR TODOS LOS MONSTRUOS QUE TENGAN UN MAL ROLLO QUE IMPLIQUE SOLO PERDIDA DE NIVELES"

@monsters.each do |monstruo|
  if monstruo.badconsequence.levels != 0 && monstruo.badconsequence.nVisibleTreasures == 0 && monstruo.badconsequence.nHiddenTreasures == 0 && monstruo.badconsequence.specificHiddenTreasures == [] && monstruo.badconsequence.specificVisibleTreasures == []
    puts "\nMonstruo: #{monstruo}"
  end
end

puts "\nGANANCIA DE TESOROS SUPERIOR A 1"

@monsters.each do |monstruo|
  if monstruo.price.treasures > 1
    puts "\nMonstruo: #{monstruo}"
  end
end

puts "\nPERDIDA DE UN TESORO DETERMINADO"

@monsters.each do |monstruo|
  if monstruo.badconsequence.specificHiddenTreasures != [] or monstruo.badconsequence.specificVisibleTreasures != []
    puts "\nMonstruo: #{monstruo}"
  end  
end
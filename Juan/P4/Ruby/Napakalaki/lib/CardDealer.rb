#encoding: utf-8
###
#Versión 3.0
require 'singleton'
require_relative 'Monster.rb'
require_relative 'Prize.rb'
require_relative 'TreasureKind.rb'
require_relative 'Treasure.rb'
require_relative 'BadConsequence.rb'
require_relative 'Dice.rb'
require_relative 'Player.rb'
require_relative 'Cultist.rb'
require_relative 'SpecificBadConsequence.rb'
require 'singleton'
module NapakalakiGame

class CardDealer
    include Singleton
#    @@instance = nil #null es #nil
    private
    def initialize()        
        @unusedMonsters  = Array.new()   # Relación con Monster
        @usedMonsters    = Array.new()   # Relación con Monster
        @unusedTreasures = Array.new() # Relación con Treasure
        @usedTreasures   = Array.new() # Relación con Treasure
        
        @usedCultist = Array.new()
        @unusedCultist   = Array.new() # Relación con Cultist
    end
    
    private 
    def initTreasureCardDeck()
        @unusedTreasures << Treasure.new("¡Si mi amo!",4,TreasureKind::HELMET )
        @unusedTreasures << Treasure.new("Botas de invetigacion",3,TreasureKind::SHOES )
        @unusedTreasures << Treasure.new("Capucha de Cthulhu",3,TreasureKind::HELMET )
        @unusedTreasures << Treasure.new("A prueba de babas",2,TreasureKind::ARMOR )
        @unusedTreasures << Treasure.new("Botas de lluvia ácida",1,TreasureKind::BOTHHANDS )
        @unusedTreasures << Treasure.new("Casco minero",2, TreasureKind::HELMET )
        @unusedTreasures << Treasure.new("Amatralladora Thompson",4,TreasureKind::BOTHHANDS )
        @unusedTreasures << Treasure.new("Camiseta de la UGR",1,TreasureKind::ARMOR )
        @unusedTreasures << Treasure.new("Clavo de rail ferroviario",3,TreasureKind::ONEHAND )
        @unusedTreasures << Treasure.new("Cuchillo de sushi arcano",2,TreasureKind::ONEHAND )
        @unusedTreasures << Treasure.new("Fez alopdo",3,TreasureKind::HELMET )
        @unusedTreasures << Treasure.new("Hacha prehistorica",2, TreasureKind::ONEHAND )
        @unusedTreasures << Treasure.new("El aparato del Pr. Tesla",4, TreasureKind::ARMOR )
        @unusedTreasures << Treasure.new("Gaita",4,TreasureKind::BOTHHANDS )
        @unusedTreasures << Treasure.new("Insecticida",2,TreasureKind::ONEHAND )
        @unusedTreasures << Treasure.new("Escopeta de 3 cañones",4,TreasureKind::BOTHHANDS )
        @unusedTreasures << Treasure.new("Garabato mistico",2,TreasureKind::ONEHAND )
        @unusedTreasures << Treasure.new("La rebeca metalica",2,TreasureKind::ARMOR )
        @unusedTreasures << Treasure.new("Lanzallamas",4,TreasureKind::BOTHHANDS )
        @unusedTreasures << Treasure.new("Necro-comicon",1,TreasureKind::ONEHAND )
        @unusedTreasures << Treasure.new("Necronomicon",5,TreasureKind::BOTHHANDS )
        @unusedTreasures << Treasure.new("Linterna a 2 manos",3,TreasureKind::BOTHHANDS )
        @unusedTreasures << Treasure.new("Necrognomicon",2, TreasureKind::ONEHAND )
        @unusedTreasures << Treasure.new("Necrotelecom",2,TreasureKind::HELMET )
        @unusedTreasures << Treasure.new("Mazo de los antiguos",3,TreasureKind::ONEHAND )
        @unusedTreasures << Treasure.new("Necro-playbocón",3,TreasureKind::ONEHAND)
        @unusedTreasures << Treasure.new("Porra preternatural",2,TreasureKind::ONEHAND )        
        @unusedTreasures << Treasure.new("Shogulador",1,TreasureKind::BOTHHANDS)
        @unusedTreasures << Treasure.new("Varita de atizamiento",3, TreasureKind::ONEHAND )
        @unusedTreasures << Treasure.new("Tentaculo de pega",2,TreasureKind::HELMET )
        @unusedTreasures << Treasure.new("Zapato deja-amigos",1,TreasureKind::SHOES )
    
    end
    
    private 
    def initMonstersCardDeck()
        
        #3 Byakhees de bonanza
        

        price = Prize.new(2,1)
        badconsequence = SpecificBadConsequence('Pierdes tu armadura visible y otra oculta',0,[TreasureKind::ARMOR],[TreasureKind::ARMOR])
        @unusedMonsters << Monster.new('3 Byakhees de bonanza',8,badconsequence,price,0)

        # Chibithulhu

        price = Prize.new(1,1)
        badconsequence = SpecificBadConsequence('Embobados don el lindo primigenio te descartas de tu casco visible',0,[TreasureKind::HELMET],[])
        @unusedMonsters << Monster.new('Chibithulhu',2,badconsequence,price,0)

        # El sopor de Dunwich

        price = Prize.new(1,1)
        badconsequence = SpecificBadConsequence('El primordial bostezo contagioso. Pierdes el calzado visible',0,[TreasureKind::SHOES],[])
        @unusedMonsters << Monster.new('El sopor de Dunwich',2,badconsequence,price,0)


        # Ángeles de la noche ibicenca

        price = Prize.new(4,1)
        badconsequence = SpecificBadConsequence('Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible y  1 mano oculta',0 ,[TreasureKind::ONEHAND],[TreasureKind::ONEHAND])
        @unusedMonsters << Monster.new('Angeles de la noche ibicenca',14,badconsequence,price,0)

        # El gorrón en el umbral      
        
        price = Prize.new(3,1)
        badconsequence = NumericBadConsequence('El gorron en el umbral',0,BadConsequence::MAXTREASURES,0)
        @unusedMonsters << Monster.new('El gorron en el umbra',10,badconsequence,price,0)

        # H.P. Munchcraft

        price = Prize.new(2,1)
        badconsequence = SpecificBadConsequence('Pierdes la armadura visible',0,[TreasureKind::ARMOR],[])
        @unusedMonsters<< Monster.new('H.P. Munchcraft',6,badconsequence,price,0)

        # Bichgooth

        price = Prize.new(1,1)
        badconsequence = SpecificBadConsequence('Sientes bichos bajo la ropa. Descarta la armadura visible',0,[TreasureKind::ARMOR] , [] )
        @unusedMonsters << Monster.new('Bichgooth',2,badconsequence,price,0)


        # El rey de rosa

        price = Prize.new(4,2)
        badconsequence = NumericBadConsequence('Pierdes 5 niveles y 3 tesoros visibles', 5, 3, 0)
        @unusedMonsters << Monster.new('El rey de rosa',13,badconsequence,price,0)

        # La que redacta en las tinieblas

        price = Prize.new(1,1)
        badconsequence = NumericBadConsequence('Toses los pulmones y pierdes 2 niveles',2,0,0)
        @unusedMonsters << Monster.new('La que redacta en las tinieblas',2,badconsequence,price,0)

        # Los hondos

        price = Prize.new(2,1)
        badconsequence = DeathBadConsequence("Estos monstruos resultan bastante superficiales y te aburren mortalmente. Estas muerto")
        @unusedMonsters << Monster.new('Los hondos',8,badconsequence,price,0)

        # Semillas Cthulhu

        price = Prize.new(2,1)
        badconsequence = NumericBadConsequence('Pierdes 2 niveles y 2 tesoros ocultos',2,0,2)
        @unusedMonsters << Monster.new('Semillas Cthulhu',4,badconsequence,price,0)

        # Dameargo

        price = Prize.new(2,1)
        badconsequence = SpecificBadConsequence('Te intentas escaquear. Pierdes una mano visible',0,[TreasureKind::ONEHAND],[])
        @unusedMonsters << Monster.new('Dameargo',1,badconsequence,price,0)

        # Pollipólipo volante

        price = Prize.new(1,1)
        badconsequence = NumericBadConsequence('Da mucho asquito. Pierdes 3 niveles.',3,0,0)
        @unusedMonsters << Monster.new('Pollipolipo volante',3,badconsequence,price,0)

        # Yskhtihyssg-Goth

        price = Prize.new(3,1)
        badconsequence = DeathBadConsequence('No le hace gracia que pronuncien mal su nombre. Estas muerto')
        @unusedMonsters << Monster.new('Yskhtihyssg-Goth',12,badconsequence,price,0)

        # Familia feliz

        price = Prize.new(4,1)
        badconsequence = DeathBadConsequence("La familia te atrapa. Estas muerto")
        @unusedMonsters << Monster.new('Familia feliz',1,badconsequence, price,0)

        # Roboggoth
        price = Prize.new(2,1)
        badconsequence = SpecificBadConsequence('La quinta directeiva primaria te obliga a perder 2 niveles y un tesoro, 2 manos visibles.',2,[TreasureKind::BOTHHANDS],[])
        @unusedMonsters << Monster.new('Roboggoth',8,badconsequence,price,0)

        # El espía

        price = Prize.new(1,1)
        badconsequence = SpecificBadConsequence('Te asusta en la noche. Pierdes un casco visible',0,[TreasureKind::HELMET],[])
        @unusedMonsters << Monster.new('El espia',5,badconsequence,price,0)

        # El Lenguas

        price = Prize.new(1,1)
        badconsequence = NumericBadConsequence('Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles',2, 5,0)
        @unusedMonsters << Monster.new('El Lenguas',20,badconsequence,price,0)

        # Bicéfalo

        price = Prize.new(1,1)
        badconsequence = SpecificBadConsequence('Te faltan manos para tanta cabeza. Pierdes 3 niveles y tus tesoros visibles de las manos',3,[TreasureKind::ONEHAND,TreasureKind::ONEHAND,TreasureKind::BOTHHANDS],[])
        @unusedMonsters << Monster.new('Bicefalo',20,badconsequence,price,0)
        
        
        price = Prize.new(3,1)
        badconsequence = SpecificBadConsequence('Pierdes una mano visible',0,[TreasureKind::ONEHAND],[])
        @unusedMonsters << Monster.new('El mal indecible impronunciable',10,badconsequence,price,-2)
        
        
        price = Prize.new(2,1)
        badconsequence = NumericBadConsequence('Pierdes tus tesoros visibles',0,10,0)
        @unusedMonsters << Monster.new('Testigos oculares',6,badconsequence,price,+2)
        
        
        price = Prize.new(2,5)
        badconsequence = DeathBadConsequence('Hoy no es tu dia de suerte. Mueres.')
        @unusedMonsters << Monster.new('El gran cthulhu',20,badconsequence,price,+4)
        
        
        price = Prize.new(2,1)
        badconsequence = NumericBadConsequence('Tu gobierno te recorta 2 niveles',2,0,0)
        @unusedMonsters << Monster.new('Serpiente politico',8,badconsequence,price,-2)
        
        
        price = Prize.new(1,1)
        badconsequence = SpecificBadConsequence('Pierdes tu casco y tu armadura visible. Pierdes tus manos ocultas.',0,[TreasureKind::HELMET,TreasureKind::ARMOR],[TreasureKind::ONEHAND,TreasureKind::ONEHAND,TreasureKind::BOTHHANDS])
        @unusedMonsters << Monster.new('Felpuggoth',2,badconsequence,price,+5)
        
        
        price = Prize.new(4,2)
        badconsequence = NumericBadConsequence('Pierdes 2 niveles',2,0,0)
        @unusedMonsters << Monster.new('Shoggoth',16,badconsequence,price,-4)
        
        
        price = Prize.new(1,1)
        badconsequence = NumericBadConsequence('Pierdes 2 niveles',2,0,0)
        @unusedMonsters << Monster.new('Lolitagooth',2,badconsequence,price,+3)

    end
    
    private
    def initCultistCardDeck
        
        @unusedCultist << Cultist.new('Sectario','+1')
        @unusedCultist << Cultist.new('Sectario','+2')
        @unusedCultist << Cultist.new('Sectario','+1')
        @unusedCultist << Cultist.new('Sectario','+2')
        @unusedCultist << Cultist.new('Sectario','+1')
        @unusedCultist << Cultist.new('Sectario','+1')
        
    end
    
    private
    def shuffleTreasures()
        @unusedTreasures.shuffle!
    end
    
    def shuffleMonsters()
        @unusedMonsters.shuffle!
    end
    
    def shuffleCultist()
        @unusedCultist.shuffle!
    end
     
    
    public
    def nextTreasure()
        
        
        
        aux = @unusedTreasures[0]
        
        @unusedTreasures.delete(aux)
        if @unusedTreasures.empty?
            tmp = @unusedTreasures
            @unusedTreasures = @usedTreasures
            @usedTreasures = tmp
#            @usedTreasures.each  do |i|
#                @unusedTreasures << i
#            end
#            @usedTreasures.clear #quitamos las cartas de los descartes
        end
        shuffleTreasures() #barajamos el mazo de tesoros
        

        #Ponemos la primera carta               
        #aux = @unusedTreasures.fetch(0)
        
        
              
      
        return aux
    end
    
    
    def nextMonster()
        monstruo = @unusedMonsters[0]
        @unusedMonsters.delete(monstruo) 
        if(@unusedMonsters.empty?)
            @unusedMonsters = @usedMonsters
            self.shuffleMonsters()
            
        end
        return monstruo
    end
    
    def nextCultist()
        cultist = @unusedCultist[0]
        @unusedCultist.delete(cultist)
        
        if(@unusedCultist.empty?)
            @unusedCultist = @usedCultist
            self.shuffle
        end
    end
    
    def giveTreasureBack(t)
        @usedTreasures << t
    end
    
    def giveMonsterBack(m)
        @usedMonsters << m
    end
    def initCards()
        initTreasureCardDeck()
        initMonstersCardDeck()
        initCultistCardDeck()
    end
    
end
end
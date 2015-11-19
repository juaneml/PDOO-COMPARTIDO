require_relative 'Treasure.rb'
require_relative 'Monster.rb'
require_relative 'Prize.rb'
require_relative 'BadConsequence.rb'

include Singleton

class CardDealer
    
    #@@instance = nil
    private
    #/*Constructor/
    def initialize()
        @unusedMonsters=Array.new
        @usedMonsters=Array.new
        @unusedTreasures=Array.new
        @usedTreasures=Array.new
    end
    
    attr_reader :unusedMonster
    
    #/*Iniciar cartas tesoros/
    def initTreasureCardDeck
        
#        def initialize(n,b,t)
#        @name=n
#        @bonus=b
#        @treasure=t
#    end
    
        @unusedTreasures << Treasure.new('¡Si mi amo!', 4, TreasureKind::ARMOR)
        
        @unusedTreasures << Treasure.new('Botas de investigacion', 3, TreasureKind::SHOES)
        
        @unusedTreasures << Treasure.new('Capucha de Cthulhu', 3, TreasureKind::HELMET)
        
        @unusedTreasures << Treasure.new('A Prueba de babas', 2, TreasureKind::ARMOR)
        
        @unusedTreasures << Treasure.new('Botas de lluvia ácida',1 , TreasureKind::BOTHHANDS)
        
        @unusedTreasures << Treasure.new('Casco minero',2 , TreasureKind::HELMET)
        
        @unusedTreasures << Treasure.new('Ametralladora Thompson',4 , TreasureKind::BOTHHANS)
        
        @unusedTreasures << Treasure.new('Camiseta de UGR',1 , TreasureKind::ARMOR)
        
        @unusedTreasures << Treasure.new('Clavo de rail ferroviario',3 , TreasureKind::ONEHAND)
        
        @unusedTreasures << Treasure.new('Cuchillo de shusi arcano',2 , TreasureKind::ONEHAND)
        
        @unusedTreasures << Treasure.new('Fez alopodo', 3, TreasureKind::HELMET)
        
        @unusedTreasures << Treasure.new('Hacha prehistorica',3 , TreasureKind::ONEHAND)
        
        @unusedTreasures << Treasure.new('El aparato del profesor Tesla',4 , TreasureKind::ARMOR)
        
        @unusedTreasures << Treasure.new('Gaita',4 , TreasureKind::BOTHHANDS)
        
        @unusedTreasures << Treasure.new('Insecticida',2 , TreasureKind::ONEHAND)
        
        @unusedTreasures << Treasure.new('Escopeta de tres cañones',4 , TreasureKind::BOTHHANDS)
        
        @unusedTreasures << Treasure.new('Garabato mistico',2 , TreasureKind::ONEHAND)
        
        @unusedTreasures << Treasure.new('La rebeca metalica',2 , TreasureKind::ARMOR)
        
        @unusedTreasures << Treasure.new('Lanzallamas',4 , TreasureKind::BOTHHANDS)
        
        @unusedTreasures << Treasure.new('Necromicon',1 , TreasureKind::ONEHAND)
        
        @unusedTreasures << Treasure.new('Necronomicon',5 , TreasureKind::BOTHHANDS)
        
        @unusedTreasures << Treasure.new('Linterna a dos manos',3 , TreasureKind::BOTHHANDS)
        
        @unusedTreasures << Treasure.new('Necrognomicon',1 , TreasureKind::ONEHAND)
        
        @unusedTreasures << Treasure.new('Necrotelecom',2 , TreasureKind::HELMET)
        
        @unusedTreasures << Treasure.new('Mazo de los antiguos', 3, TreasureKind::ONEHAND)
        
        @unusedTreasures << Treasure.new('Necroplayboycon',3, TreasureKind::ONEHAND)
        
        @unusedTreasures << Treasure.new('Porra preternatural',2 , TreasureKind::ONEHAND)
        
        @unusedTreasures << Treasure.new('Shogulador', 1, TreasureKind::BOTHHANDS)
        
        @unusedTreasures << Treasure.new('Varita de atizamiento',3 , TreasureKind::ONEHAND)

        @unusedTreasures << Treasure.new('Tentaculo de pega',2 , TreasureKind::HELMET)
        
        @unusedTreasures << Treasure.new('Zapato deja-amigos',1 , TreasureKind::SHOES)
        
        
    end
    
    #/*Iniciar cartas monstruos/
    def initMonsterCardDeck
       

        # 3 Byakhees de bonanza

        price = Prize.new(2,1)
        badconsequence = BadConsequence.newLevelSpecificTreasures('Pierdes tu armadura visible y otra oculta',0,[TreasureKind::ARMOR],[TreasureKind::ARMOR])
        @unusedMonsters << Monster.new('3 Byakhees de bonanza',8,badconsequence,price)

        # Chibithulhu

        price = Prize.new(1,1)
        badconsequence = BadConsequence.newLevelSpecificTreasures('Embobados don el lindo primigenio te descartas de tu casco visible',0,[TreasureKind::HELMET],[])
        @unusedMonsters << Monster.new('Chibithulhu',2,badconsequence,price)

        # El sopor de Dunwich

        price = Prize.new(1,1)
        badconsequence = BadConsequence.newLevelSpecificTreasures('El primordial bostezo contagioso. Pierdes el calzado visible',0,[TreasureKind::SHOES],[])
        @unusedMonsters << Monster.new('El sopor de Dunwich',2,badconsequence,price)


        # Ángeles de la noche ibicenca

        price = Prize.new(4,1)
        badconsequence = BadConsequence.newLevelSpecificTreasures('Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible y  1 mano oculta',0 ,[TreasureKind::ONEHAND],[TreasureKind::ONEHAND])
        @unusedMonsters << Monster.new('Angeles de la noche ibicenca',14,badconsequence,price)

        # El gorrón en el umbral

        price = Prize.new(3,1)
        badconsequence = BadConsequence.newLevelNumberOfTreasures('Pierdes todos tus tesoros visibles',0,BadConsequence.MAXTREASURES,0)
        @unusedMonsters << Monster.new('El gorron en el umbral',10,badconsequence,price)

        BadConsequence.
        # H.P. Munchcraft

        price = Prize.new(2,1)
        badconsequence = BadConsequence.newLevelSpecificTreasures('Pierdes la armadura visible',0,[TreasureKind::ARMOR],[])
        @unusedMonsters << Monster.new('H.P. Munchcraft',6,badconsequence,price)

        # Bichgooth

        price = Prize.new(1,1)
        badconsequence = BadConsequence.newLevelSpecificTreasures('Sientes bichos bajo la ropa. Descarta la armadura visible',0,[TreasureKind::ARMOR] , [] )
        @unusedMonsters << Monster.new('Bichgooth',2,badconsequence,price)


        # El rey de rosa

        price = Prize.new(4,2)
        badconsequence = BadConsequence.newLevelNumberOfTreasures('Pierdes 5 niveles y 3 tesoros visibles', 5, 3, 0)
        @unusedMonsters << Monster.new('El rey de rosa',13,badconsequence,price)

        # La que redacta en las tinieblas

        price = Prize.new(1,1)
        badconsequence = BadConsequence.newLevelNumberOfTreasures('Toses los pulmones y pierdes 2 niveles',2,0,0)
        @unusedMonsters << Monster.new('La que redacta en las tinieblas',2,badconsequence,price)

        # Los hondos

        price = Prize.new(2,1)
        badconsequence = BadConsequence.newDeath("Estos monstruos resultan bastante superficiales y te aburren mortalmente. Estas muerto")
        @unusedMonsters << Monster.new('Los hondos',8,badconsequence,price)

        # Semillas Cthulhu

        price = Prize.new(2,1)
        badconsequence = BadConsequence.newLevelNumberOfTreasures('Pierdes 2 niveles y 2 tesoros ocultos',2,0,2)
        @unusedMonsters << Monster.new('Semillas Cthulhu',4,badconsequence,price)

        # Dameargo

        price = Prize.new(2,1)
        badconsequence = BadConsequence.newLevelSpecificTreasures('Te intentas escaquear. Pierdes una mano visible',0,[TreasureKind::ONEHAND],[])
        @unusedMonsters << Monster.new('Dameargo',1,badconsequence,price)

        # Pollipólipo volante

        price = Prize.new(1,1)
        badconsequence = BadConsequence.newLevelNumberOfTreasures('Da mucho asquito. Pierdes 3 niveles.',3,0,0)
        @unusedMonsters << Monster.new('Pollipolipo volante',3,badconsequence,price)

        # Yskhtihyssg-Goth

        price = Prize.new(3,1)
        badconsequence = BadConsequence.newDeath('No le hace gracia que pronuncien mal su nombre. Estas muerto')
        @unusedMonsters << Monster.new('Yskhtihyssg-Goth',12,badconsequence,price)

        # Familia feliz

        price = Prize.new(4,1)
        badconsequence = BadConsequence.newDeath("La familia te atrapa. Estas muerto")
        @unusedMonsters << Monster.new('Familia feliz',1,badconsequence, price)

        # Roboggoth
        price = Prize.new(2,1)
        badconsequence = BadConsequence.newLevelSpecificTreasures('La quinta directeiva primaria te obliga a perder 2 niveles y un tesoro, 2 manos visibles.',2,[TreasureKind::BOTHHANDS],[])
        @unusedMonsters << Monster.new('Roboggoth',8,badconsequence,price)

        # El espía

        price = Prize.new(1,1)
        badconsequence = BadConsequence.newLevelSpecificTreasures('Te asusta en la noche. Pierdes un casco visible',0,[TreasureKind::HELMET],[])
        @unusedMonsters << Monster.new('El espia',5,badconsequence,price)

        # El Lenguas

        price = Prize.new(1,1)
        badconsequence = BadConsequence.newLevelNumberOfTreasures('Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles',2, 5,0)
        @unusedMonsters << Monster.new('El Lenguas',20,badconsequence,price)

        # Bicéfalo

        price = Prize.new(1,1)
        badconsequence = BadConsequence.newLevelSpecificTreasures('Te faltan manos para tanta cabeza. Pierdes 3 niveles y tus tesoros visibles de las manos',3,[TreasureKind::BOTHHANDS,TreasureKind::ONEHAND,TreasureKind::ONEHAND],[])
        @unusedMonsters << Monster.new('Bicefalo',20,badconsequence,price)
    end
    
    #/*Barajar tesoros/
    def shuffleTreasures
        @unusedMonsters.shuffle!
    end
    
    #/*Barajar Monstruos/
    def shuffleMonsters
        @unusedTreasures.shuffle!
    end
    
    public
    #/*Devuelve instancia de barajador/
#    def self.getInstance
#       
#    end
    
    #/*siguiente tesoro/
    def nextTreasure
        
    end
    
    #/*siguiente monstruo/
    def nextMonster
        
    end
    
    #/*devuelve tesoro/
    def giveTreasureBack(t)
        @usedTreasures << t
    end
    
    #/*Devuelve monstruo/
    def giveMonsterBack(m)
        @usedMonsters << m
    end
    
    #/*Inicializar cartas/
    def initCards
        
    end
    
end
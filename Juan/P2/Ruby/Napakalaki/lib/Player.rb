require_relative 'Treasure.rb'
require_relative 'BadConsequence.rb'
require_relative  'CardDealer.rb'
require_relative  'Dice.rb'


class Player
   # /*Constructor/
    @@MAXLEVEL=10
    
    
    def initialize(nombre)
        @name=nombre
        @level=0
        @dead=false
        @canISteal=false
        @enemy=self
        @hiddenTreasures=Array.new
        @visibleTreasures=Array.new
        @pendingBadConsequence=BadConsequence.new
    end
    
    #/*Consultores/
    attr_reader :name, :visibleTreasures, :hiddenTreasures, :level
    
    private
    #/*Revivir/
    def bringToLife
        @dead= false
    end
    
    #/*Conseguir nivel de combate/
    def getCombatLevel()
        sum_bonus=0
        
        while i< @visibleTreasures.size
            i=i+1
            sum_bonus = @visibleTreasures.fetch(i).bonus + sum_bonus
        end
        
        @level = @level + sum_bonus
    end
    
    #/*Incrementar niveles/
    def incrementLevels(l)
        @level= @level + l
    end
    
    #/*Decrementar niveles/
    def decrementLevels(l)
        if(@level>1)
            @level= @level - l
        end
    end
    
    #/*Añadir mal rollo/
    def setPendingBadConsequence(b)
        @pendingBadConsequence=b
    end
    
    #/*Recibir premio/
    def applyPrize(m)
        
    end
    
    #/*Aplicar mal rollo/
    def applyBadConsequence(m)
        
    end
    
    #/*Mirar si es posible hacer tesoro visible/
    def canMakeTreasureVisible(t)
        
    end
    
    #/*Cuantos tesoros hay visibles/
    def howManyVisibleTreasures(tKind)
        num =0
        @visibleTreasures.each do |t|
            if(t.type == tKind)
                num= num +1
            end
        end
        
        num
    end
    
    #/*Muere si no tienes tesoros/
    def dieIfNoTreasures()
        if(@hiddenTreasures.empty? and @visibleTreasures.empty?)
            @dead = true
        end
    end
    
    #/*Dame un tesoro/
    def giveMeATreasure
        
    end
    
    #/*Puedes darme un tesoro/
    def canYouGiveMeATreasure
        if(!hiddenTreasures.isEmpty)
            true
        else
            false
        end
        
    end
    
    #/*Ser robado/
    def haveStolen
        if @hiddenTreasures.empty?
            @canISteal=false
        else
            @canISteal=true
        end
        
        
    end
    
    public
    
    #/*Estas muerto/
    def isDead()
        @dead
    end
    
    #Esto posiblemente se pueda borrar
    def getHiddenTreasures
        
    end
    
    def getVisibleTreasures
        
    end
    ################################
    
   # /*Lleva combate acabo/
    def combat(m)
        
    end
    
    #/*Hace tesoro visible/
    def makeTreasureVisible(t)
        
    end
    
    #/*Descarta un tesoro visible/
    def discardVisibleTreasure(t)
    
    end
    
    #/*Descarta un tesoro oculto/
    def discardHiddenTreasure(t)
        
    end
    
    #/*Estado válido/
    def validState
        valid
        if(pendingBadConsequence.isEmpty and hiddenTreasures.size <= 4)
            valid =true
        else
            valid=false
        end
        valid
    end
    
    #/*Inicializar tesoros/
    def initTreasures
        
    end
    
    #lo mismo este tambien se puede coger con el attr
    #/*Obtener niveles/
    def getLevels
        @level
    end
    
    #/*Robar tesoro/
    def stealTreasure
        
    end
    
    #/*Jugador enemigo/
    def setEnemy(enemigo)
        @enemy=enemigo
    end
    
    #/*Puedo robar/
    def canISteal
       puedes=false
       if@hiddenTreasures.empty?
           puedes=true
           
       end
       puedes
    end
    
    #/*Descartar todos los tesoros/
    def discardAllTreasures
        
    end
    
    
    
    
end
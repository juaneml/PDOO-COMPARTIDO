require_relative 'Treasure.rb'
require_relative 'BadConsequence.rb'
require_relative  'CardDealer.rb'
require_relative  'Dice.rb'


class Player
    /*Constructor/
    def initialize(nombre)
        @name=nombre
        @level=0
        @dead=true
        @canISteal=true
        @enemy=Player.new
        @hiddenTreasures=Array.new
        @visibleTreasures=Array.new
        @pendingBadConsequence=BadConsequence.new
        @robado=false
        @@MAXLEVEL=10
    end
    
    /*Consultores/
    attr_accesor :name
    
    /*Revivir/
    def bringToLife
        @dead= false
    end
    
    /*Conseguir nivel de combate/
    def getCombatLevel()
        @combatLevel = @level + @bonusLevel
    end
    
    /*Incrementar niveles/
    def incrementLevels(l)
        @level= @level + l
    end
    
    /*Decrementar niveles/
    def decrementLevels(l)
        @level= @level - l
    end
    
    /*Añadir mal rollo/
    def setPendingBadConsequence(b)
        @pendingBadConsequence=b
    end
    
    /*Recibir premio/
    def applyPrize(m)
        
    end
    
    /*Aplicar mal rollo/
    def applyBadConsequence(m)
        
    end
    
    /*Mirar si es posible hacer tesoro visible/
    def canMakeTreasureVisible(t)
        
    end
    
    /*Cuantos tesoros hay visibles/
    def howManyVisibleTreasures(tKind)
        @visibleTreasures.size
    end
    
    /*Muere si no tienes tesoros/
    def dieIfNoTreasures()
        if(hiddenTreasures = [] and visibleTreasures = [])
            @dead = true
        end
    end
    
    /*Dame un tesoro/
    def giveMeATreasure
        
    end
    
    /*Puedes darme un tesoro/
    def canYouGiveMeATreasure
        if(!hiddenTreasures.isEmpty)
            true
        else
            false
        end
        
    end
    
    /*Ser robado/
    def haveStolen
        if(robado)
            canISteal=false
        end
    end
    
    public
    
    /*Estas muerto/
    def isDead()
        @dead
    end
    
    #Esto posiblemente se pueda borrar
    def getHiddenTreasures
        
    end
    
    def getVisibleTreasures
        
    end
    ################################
    
    /*Lleva combate acabo/
    def combat(m)
        
    end
    
    /*Hace tesoro visible/
    def makeTreasureVisible(t)
        
    end
    
    /*Descarta un tesoro visible/
    def discardVisibleTreasure(t)
    
    end
    
    /*Descarta un tesoro oculto/
    def discardHiddenTreasure(t)
        
    end
    
    /*Estado válido/
    def validState
        if(pendingBadConsequence.isEmpty and hiddenTreasures.size <= 4)
            true
        else
            false
        end
    end
    
    /*Inicializar tesoros/
    def initTreasures
        
    end
    
    #lo mismo este tambien se puede coger con el attr
    /*Obtener niveles/
    def getLevels
        @level
    end
    
    /*Robar tesoro/
    def stealTreasure
        
    end
    
    /*Jugador enemigo/
    def setEnemy(enemigo)
        @enemy=enemigo
    end
    
    /*Puedo robar/
    def canISteal
        if(robado)
            canISteal=true
        else
            canISteal=false
        end
    end
    
    /*Descartar todos los tesoros/
    def discardAllTreasures
        
    end
    
    
    
    
end
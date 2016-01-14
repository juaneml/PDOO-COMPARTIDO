# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

puts "Hello World"

#CLASE ABSTRACTA RUBY

# class Empleado
# end
# attr_accessor :nombre, :dni, :director
# def initialize(nom,dni)
# @nombre = nom
# @dni = dni
# @director = nil
# end
#!!!! private_class_method :new !!!
# end

#METODOS ABSTRACTOS
#def calcularNomina
#!!!!! raise NotImplementedError.new 
#end




#CLASE QUE HEREDA DE LA CLASE ABSTRACTA

# class EmpleadoAsalariado < Empleado
# attr_accessor :salario
# def initialize(nom,dni,sal)
# super(nom,dni)
# @salario=sal
# end
# public_class_method :new
# end

# METODO REDEFINIDO EN LA SUBCLASE
#def calcularNomina
#@salario+250
#end

#EN RUBY PARA SIMULAR LA HERENCIA MULTIPLE
#INTERFAZ SE HACE CON module nombre_interfaz

#Ejemplo
#
#||Interfaz||
#
#module FiguraGrafica 
#$GROSORBORDE = 2 # constante global
#def pintarBorde(color)
#raise NotImplementedError.new
#end
#def colorear(color)
#raise NotImplementedError.new
#end
#end

# || clase abstracta ||
#
#class FiguraGeometrica
#attr_accessor :numLados
#def initialize(lados)
#@numLados=lados
#end
#private_class_method :new
#def perimetro
#raise NotImplementedError.new
#end
#def area
#raise NotImplementedError.new
#end
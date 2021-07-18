# language: pt

Funcionalidade: Preencher solicitacao de Seguro de Veiculos
  
  Contexto:
  	Dado que estou na pagina de solicitacao de seguro de veiculos
  	
	Cenario: Preencher formulario de cadastro de solicitacao de seguro para veiculos
		Quando seleciono a opcao de seguro "Automobile"
		Entao a aba Enter Vehicle Data eh apresentada para a opcao de seguro "Automobile"
		
		Quando preencho o campo Make com o valor "Honda"
    E preencho o campo Engine Performance com o valor "400"
    E preencho o campo  Date of Manufacture com o valor "07/14/2021" no formato MM/dd/yyyy
    E preencho o campo Number of Seats com o valor "5"
    E preencho o campo Fuel Type com o valor "Petrol"
    E preencho o campo List Price com o valor "34000.00"
    E preencho o campo License Plate Number com o valor "abc 1234"
    E preencho o campo Annual Mileage com o valor "1000"
    E clico no botao Next da aba Enter Vehicle Data
    Entao a aba Enter Insurant Data eh apresentada
    
    Quando estou na aba Enter Insurant Data
    E preencho o campo First Name com o valor "Joao"
    E preencho o campo Last Name com o valor "Barbosa"
    E preencho o campo Birth Date com o valor "12/09/1979" no formato MM/dd/yyyy
    E seleciono no campo gender o valor "Male"
    E preencho o campo Street Address com o valor "Rua Alferes Poli"
    E seleciono no campo country o valor "Brazil"
    E preencho o campo zipcode com o valor "80230090"
    E preencho o campo city com o valor "Curitiba"
    E seleciono no campo occupation o valor "Selfemployed"
    E seleciono no campo hobbies os valores "Skydiving, Other"
    E preencho o campo website com o valor "www.joaobarbosa.com"
    E seleciono a foto "carro.jpg" para envio
    E clico no botao Next da aba Enter Insurant Data
    Entao a aba Enter Product Data eh apresentada
    
    Quando estou na aba Enter Product Data
    E preencho o campo Start Date com o valor "09/09/2021" no formato MM/dd/yyyy
    E seleciono no campo Insurance Sum o valor "3.000.000,00"
    E seleciono no campo Merit Rating o valor "Super Bonus"
    E seleciono no campo Damage Insurance o valor "Full Coverage"
    E seleciono no campo Optional Products os valores "Euro Protection, Legal Defense Insurance"
    E seleciono no campo Courtesy Car o valor "Yes"
    E clico no botao Next da aba Enter Product Data
    Entao a aba Select Price Option eh apresentada
    
    Quando estou na aba Select Price Option
    E seleciono a opcao de preco "Ultimate"
    E clico no botao Next da aba Select Price Option
    Entao a aba Send Quote eh apresentada
    
    Quando estou na aba Send Quote
    E preencho o campo email com o valor "joaobarbosa@email.com"
    E preencho o campo phone com o valor "41986578985"
    E preencho o campo username com o valor "joaobarbosa"
    E preencho o campo password com o valor "Amarelo01"
    E preencho o campo confirmpassword com o valor "Amarelo01"
    E preencho o campo comments com o valor "Comentarios do cadastro"
    E clico no botao Send da aba Send Quote
    Entao eh apresentada a mensagem de sucesso "Sending e-mail success!"
    
 	Cenario: Preencher formulario de cadastro de solicitacao de seguro para caminhoes
		Quando seleciono a opcao de seguro "Truck"
		Entao a aba Enter Vehicle Data eh apresentada para a opcao de seguro "Truck"
		
		Quando preencho o campo Make com o valor "Mercedes Benz"
    E preencho o campo Engine Performance com o valor "800"
    E preencho o campo  Date of Manufacture com o valor "10/05/2020" no formato MM/dd/yyyy
    E preencho o campo Number of Seats com o valor "2"
    E preencho o campo Fuel Type com o valor "Diesel"
    E preencho o campo Payload com o valor "1000"
    E preencho o campo Total Weight com o valor "5000"
    E preencho o campo List Price com o valor "100000"
    E preencho o campo License Plate Number com o valor "ert 9876"
    E preencho o campo Annual Mileage com o valor "10000"
    E clico no botao Next da aba Enter Vehicle Data
    Entao a aba Enter Insurant Data eh apresentada
    
    Quando estou na aba Enter Insurant Data
    E preencho o campo First Name com o valor "Antonio"
    E preencho o campo Last Name com o valor "Silva"
    E preencho o campo Birth Date com o valor "05/20/1954" no formato MM/dd/yyyy
    E seleciono no campo gender o valor "Male"
    E preencho o campo Street Address com o valor "Rua Josa Bonifacio, Se"
    E seleciono no campo country o valor "Brazil"
    E preencho o campo zipcode com o valor "01003000"
    E preencho o campo city com o valor "Sao Paulo"
    E seleciono no campo occupation o valor "Public Official"
    E seleciono no campo hobbies os valores "Speeding, Bungee Jumping, Cliff Diving, Skydiving, Other"
    E preencho o campo website com o valor "www.antoniosilva.com.br"
    E seleciono a foto "caminhao.jpg" para envio
    E clico no botao Next da aba Enter Insurant Data
    Entao a aba Enter Product Data eh apresentada
    
    Quando estou na aba Enter Product Data
    E preencho o campo Start Date com o valor "08/25/2021" no formato MM/dd/yyyy
    E seleciono no campo Insurance Sum o valor "35.000.000,00"
    E seleciono no campo Damage Insurance o valor "Partial Coverage"
    E seleciono no campo Optional Products os valores "Euro Protection"
    E clico no botao Next da aba Enter Product Data
    Entao a aba Select Price Option eh apresentada
    
    Quando estou na aba Select Price Option
    E seleciono a opcao de preco "Platinum"
    E clico no botao Next da aba Select Price Option
    Entao a aba Send Quote eh apresentada
    
    Quando estou na aba Send Quote
    E preencho o campo email com o valor "antoniosilva@email.com"
    E preencho o campo phone com o valor "11985200123"
    E preencho o campo username com o valor "antoniosilva"
    E preencho o campo password com o valor "99AbcdE"
    E preencho o campo confirmpassword com o valor "99AbcdE"
    E preencho o campo comments com o valor "Texto de comentario a ser inserido para o teste de cotacao de seguro de caminhao do cliente Antonio"
    E clico no botao Send da aba Send Quote
    Entao eh apresentada a mensagem de sucesso "Sending e-mail success!"
 
 Cenario: Preencher formulario de cadastro de solicitacao de seguro para motos
		Quando seleciono a opcao de seguro "Motorcycle"
		Entao a aba Enter Vehicle Data eh apresentada para a opcao de seguro "Motorcycle"
		
		Quando preencho o campo Make com o valor "BMW"
		E preencho o campo Model com o valor "Motorcycle"
		E preencho o campo Cylinder Capacity com o valor "100"
    E preencho o campo Engine Performance com o valor "1200"
    E preencho o campo  Date of Manufacture com o valor "02/27/2021" no formato MM/dd/yyyy
    E preencho o campo Number of Seats com o valor "2"
    E preencho o campo List Price com o valor "75000.00"
    E preencho o campo Annual Mileage com o valor "850"
    E clico no botao Next da aba Enter Vehicle Data
    Entao a aba Enter Insurant Data eh apresentada
    
    Quando estou na aba Enter Insurant Data
    E preencho o campo First Name com o valor "Daniela"
    E preencho o campo Last Name com o valor "Faria"
    E preencho o campo Birth Date com o valor "06/23/1986" no formato MM/dd/yyyy
    E seleciono no campo gender o valor "Female"
    E preencho o campo Street Address com o valor "Rua Felipe Schmidt, Centro"
    E seleciono no campo country o valor "Brazil"
    E preencho o campo zipcode com o valor "88010000"
    E preencho o campo city com o valor "Florianopolis"
    E seleciono no campo occupation o valor "Employee"
    E seleciono no campo hobbies os valores "Other"
    E preencho o campo website com o valor "www.danielafaria.com"
    E seleciono a foto "moto.jpg" para envio
    E clico no botao Next da aba Enter Insurant Data
    Entao a aba Enter Product Data eh apresentada
    
    Quando estou na aba Enter Product Data
    E preencho o campo Start Date com o valor "11/13/2021" no formato MM/dd/yyyy
    E seleciono no campo Insurance Sum o valor "7.000.000,00"
    E seleciono no campo Damage Insurance o valor "No Coverage"
    E seleciono no campo Optional Products os valores "Legal Defense Insurance"
    E clico no botao Next da aba Enter Product Data
    Entao a aba Select Price Option eh apresentada
    
    Quando estou na aba Select Price Option
    E seleciono a opcao de preco "Gold"
    E clico no botao Next da aba Select Price Option
    Entao a aba Send Quote eh apresentada
    
    Quando estou na aba Send Quote
    E preencho o campo email com o valor "danielafaria@email.com"
    E preencho o campo phone com o valor "48952032687"
    E preencho o campo username com o valor "danielafaria"
    E preencho o campo password com o valor "Camelo02"
    E preencho o campo confirmpassword com o valor "Camelo02"
    E preencho o campo comments com o valor "Observacoes solicitacao de seguro para moto feita por daniela"
    E clico no botao Send da aba Send Quote
    Entao eh apresentada a mensagem de sucesso "Sending e-mail success!"
    
 	Cenario: Preencher formulario de cadastro de solicitacao de seguro para camper
		Quando seleciono a opcao de seguro "Camper"
		Entao a aba Enter Vehicle Data eh apresentada para a opcao de seguro "Camper"
		
		Quando preencho o campo Make com o valor "Toyota"
    E preencho o campo Engine Performance com o valor "500"
    E preencho o campo  Date of Manufacture com o valor "04/12/2010" no formato MM/dd/yyyy
    E preencho o campo Number of Seats com o valor "5"
    E preencho o campo Right Hand Drive com o valor "No"
    E preencho o campo Fuel Type com o valor "Gas"
    E preencho o campo Payload com o valor "1000"
    E preencho o campo Total Weight com o valor "3200"
    E preencho o campo List Price com o valor "50000"
    E preencho o campo License Plate Number com o valor "XPT 3322"
    E preencho o campo Annual Mileage com o valor "200"
    E clico no botao Next da aba Enter Vehicle Data
    Entao a aba Enter Insurant Data eh apresentada
    
    Quando estou na aba Enter Insurant Data
    E preencho o campo First Name com o valor "Fernanda"
    E preencho o campo Last Name com o valor "Porto"
    E preencho o campo Birth Date com o valor "08/11/1999" no formato MM/dd/yyyy
    E seleciono no campo gender o valor "Female"
    E preencho o campo Street Address com o valor "Rua Rui Barbosa"
    E seleciono no campo country o valor "Brazil"
    E preencho o campo zipcode com o valor "15990030"
    E preencho o campo city com o valor "Matao"
    E seleciono no campo occupation o valor "Farmer"
    E seleciono no campo hobbies os valores "Bungee Jumping, Cliff Diving"
    E preencho o campo website com o valor "www.fernandaporto.com.br"
    E seleciono a foto "camper.jpg" para envio
    E clico no botao Next da aba Enter Insurant Data
    Entao a aba Enter Product Data eh apresentada
    
    Quando estou na aba Enter Product Data
    E preencho o campo Start Date com o valor "11/15/2021" no formato MM/dd/yyyy
    E seleciono no campo Insurance Sum o valor "10.000.000,00"
    E seleciono no campo Damage Insurance o valor "Full Coverage"
    E seleciono no campo Optional Products os valores "Euro Protection"
    E clico no botao Next da aba Enter Product Data
    Entao a aba Select Price Option eh apresentada
    
    Quando estou na aba Select Price Option
    E seleciono a opcao de preco "Silver"
    E clico no botao Next da aba Select Price Option
    Entao a aba Send Quote eh apresentada
    
    Quando estou na aba Send Quote
    E preencho o campo email com o valor "fernandaporto@email.com"
    E preencho o campo phone com o valor "16975862036"
    E preencho o campo username com o valor "fernandaporto"
    E preencho o campo password com o valor "Matao05"
    E preencho o campo confirmpassword com o valor "Matao05"
    E preencho o campo comments com o valor "Observacoes e comentarios do pedido de cotacao de seguro para camper cliente fernanda"
    E clico no botao Send da aba Send Quote
    Entao eh apresentada a mensagem de sucesso "Sending e-mail success!"
    
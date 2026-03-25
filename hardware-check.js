// Simulação de verificação de sistema - SallyzDev
const pcStatus = {
    processador: "Focado",
    memoria: "Lógica em dia",
    linguagem: "JavaScript",
    usuario: "Alyson Sousa Brandão"
};

function iniciarSistema() {
    console.log("Iniciando sistema de estudos...");
    console.log("Desenvolvedor: " + pcStatus.usuario);
    console.log("Status do Hardware: " + pcStatus.processador);
    console.log("Pronto para codar em " + pcStatus.linguagem + "!");
}

iniciarSistema();

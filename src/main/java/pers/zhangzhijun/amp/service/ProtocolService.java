package pers.zhangzhijun.amp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.zhangzhijun.amp.domain.Protocol;
import pers.zhangzhijun.amp.dto.ProtocolDTO;
import pers.zhangzhijun.amp.repository.ProtocolRepository;

/**
 * ClassName: pers.zhangzhijun.amp.service
 * Function :
 * Author   : ZhangZhijun
 * Date     : 10:01
 * Since    : v1.0.0
 */
@Service
public class ProtocolService {
    private Logger logger = LoggerFactory.getLogger(ProtocolService.class);

    @Autowired
    ProtocolRepository protocolRepository;

    public void createProtocol(ProtocolDTO protocolDTO){
        Protocol protocol;
        if (protocolDTO.getName() == null){
            logger.error("Protocol name cannot be null!");
        }
        protocol = convertProtocolDTOToProtocolt(protocolDTO);
        protocolRepository.save(protocol);
    }

    public ProtocolDTO getProtocol(String name) {
        if (name == null) {
            logger.error("Protocol name cannot be null!");
        }
        Protocol protocol = protocolRepository.findByName(name);
        ProtocolDTO protocolDTO = convertProtocolToProtocoltDTO(protocol);
        return protocolDTO;
    }

    public void updateProtocol(ProtocolDTO ProtocolDTO){
        Protocol protocol;
        if (ProtocolDTO.getId() == null){
            logger.error("A Protocol must be chosed!");
        }
        protocol = convertProtocolDTOToProtocolt(ProtocolDTO);
        protocolRepository.save(protocol);
    }

    public void deleteProtocol(ProtocolDTO protocolDTO){
        Protocol protocol;
        if (protocolDTO.getId() == null){
            logger.error("A Protocol must be chosed!");
        }
        protocol = convertProtocolDTOToProtocolt(protocolDTO);
        protocolRepository.delete(protocol);
    }

    public Protocol convertProtocolDTOToProtocolt(ProtocolDTO protocolDTO) {
        Protocol protocol = new Protocol();
        protocol.setId(protocolDTO.getId());
        protocol.setName(protocolDTO.getName());
        protocol.setDescription(protocolDTO.getDescription());

        return protocol;
    }

    public ProtocolDTO convertProtocolToProtocoltDTO(Protocol protocol) {
        ProtocolDTO ProtocolDTO = new ProtocolDTO();
        ProtocolDTO.setId(protocol.getId());
        ProtocolDTO.setName(protocol.getName());
        ProtocolDTO.setDescription(protocol.getDescription());

        return ProtocolDTO;
    }
}

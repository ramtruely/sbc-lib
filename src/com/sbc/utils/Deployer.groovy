// src/com/sbc/pipeline/Deployer.groovy
package com.sbc.pipeline

import com.sbc.utils.GitHelper

class Deployer {
    def deployToK8s(appName, imageTag, namespace = 'default') {
        def commit = GitHelper.getCommitHash()
        echo "Deploying ${appName}:${imageTag} (commit: ${commit}) to K8s namespace: ${namespace}"
        
        sh """
            kubectl set image deployment/${appName} ${appName}=${appName}:${imageTag} -n ${namespace}
            kubectl rollout status deployment/${appName} -n ${namespace}
        """
    }
}

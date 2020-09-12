properties([
    [$class: 'RebuildSettings', autoRebuild: false, rebuildDisabled: false], 
    parameters([
        booleanParam(defaultValue: false, description: 'Please select to apply all changes to the environment', name: 'applyChanges'), 
        booleanParam(defaultValue: false, description: 'Please select to destroy all changes to the environment', name: 'DestroyChanges'), 
        string(defaultValue: '', description: 'Please provide the Docker Image o deploy', name: 'selectDockerImage', trim: false), 
        choice(choices: ['dev', 'qa', 'stage', 'prod'], description: 'Please provide the environment to deploy', name: 'environment')
        ])
        ])

println(
    """
    Apply changes: ${params.applyChanges}
    Destroy changes: ${params.DestroyChanges}
    Docker image: ${params.selectDockerImage}
    Environment: ${params.environment}

    """
)
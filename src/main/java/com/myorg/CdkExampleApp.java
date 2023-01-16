package com.myorg;

import software.amazon.awscdk.App;

public final class CdkExampleApp {
    public static void main(final String[] args) {
        App app = new App();

        new CdkExampleStack(app, "CdkExampleStack");

        app.synth();
    }
}

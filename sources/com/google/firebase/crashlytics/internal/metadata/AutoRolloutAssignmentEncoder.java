package com.google.firebase.crashlytics.internal.metadata;

import defpackage.gv4;
import defpackage.lk9;
import defpackage.mk9;
import defpackage.pj2;
import defpackage.rc5;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class AutoRolloutAssignmentEncoder implements pj2 {
    public static final int CODEGEN_VERSION = 2;
    public static final pj2 CONFIG = new AutoRolloutAssignmentEncoder();

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class RolloutAssignmentEncoder implements lk9 {
        static final RolloutAssignmentEncoder INSTANCE = new RolloutAssignmentEncoder();
        private static final rc5 ROLLOUTID_DESCRIPTOR = rc5.a("rolloutId");
        private static final rc5 PARAMETERKEY_DESCRIPTOR = rc5.a("parameterKey");
        private static final rc5 PARAMETERVALUE_DESCRIPTOR = rc5.a("parameterValue");
        private static final rc5 VARIANTID_DESCRIPTOR = rc5.a("variantId");
        private static final rc5 TEMPLATEVERSION_DESCRIPTOR = rc5.a("templateVersion");

        private RolloutAssignmentEncoder() {
        }

        @Override // defpackage.fv4
        public void encode(RolloutAssignment rolloutAssignment, mk9 mk9Var) {
            mk9Var.a(ROLLOUTID_DESCRIPTOR, rolloutAssignment.getRolloutId());
            mk9Var.a(PARAMETERKEY_DESCRIPTOR, rolloutAssignment.getParameterKey());
            mk9Var.a(PARAMETERVALUE_DESCRIPTOR, rolloutAssignment.getParameterValue());
            mk9Var.a(VARIANTID_DESCRIPTOR, rolloutAssignment.getVariantId());
            mk9Var.g(TEMPLATEVERSION_DESCRIPTOR, rolloutAssignment.getTemplateVersion());
        }
    }

    private AutoRolloutAssignmentEncoder() {
    }

    @Override // defpackage.pj2
    public void configure(gv4 gv4Var) {
        RolloutAssignmentEncoder rolloutAssignmentEncoder = RolloutAssignmentEncoder.INSTANCE;
        gv4Var.a(RolloutAssignment.class, rolloutAssignmentEncoder);
        gv4Var.a(AutoValue_RolloutAssignment.class, rolloutAssignmentEncoder);
    }
}

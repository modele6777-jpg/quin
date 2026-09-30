package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import defpackage.hh7;
import defpackage.ib3;
import defpackage.m6c;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class RolloutAssignment {
    private static final int MAX_PARAMETER_VALUE_LENGTH = 256;
    public static final ib3 ROLLOUT_ASSIGNMENT_JSON_ENCODER;

    static {
        hh7 hh7Var = new hh7();
        AutoRolloutAssignmentEncoder.CONFIG.configure(hh7Var);
        ROLLOUT_ASSIGNMENT_JSON_ENCODER = new m6c(20, hh7Var);
    }

    public static RolloutAssignment create(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return create(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    private static String validate(String str) {
        return str.length() > MAX_PARAMETER_VALUE_LENGTH ? str.substring(0, MAX_PARAMETER_VALUE_LENGTH) : str;
    }

    public abstract String getParameterKey();

    public abstract String getParameterValue();

    public abstract String getRolloutId();

    public abstract long getTemplateVersion();

    public abstract String getVariantId();

    public CrashlyticsReport.Session.Event.RolloutAssignment toReportProto() {
        return CrashlyticsReport.Session.Event.RolloutAssignment.builder().setRolloutVariant(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.builder().setVariantId(getVariantId()).setRolloutId(getRolloutId()).build()).setParameterKey(getParameterKey()).setParameterValue(getParameterValue()).setTemplateVersion(getTemplateVersion()).build();
    }

    public static RolloutAssignment create(String str, String str2, String str3, String str4, long j) {
        return new AutoValue_RolloutAssignment(str, str2, validate(str3), str4, j);
    }
}

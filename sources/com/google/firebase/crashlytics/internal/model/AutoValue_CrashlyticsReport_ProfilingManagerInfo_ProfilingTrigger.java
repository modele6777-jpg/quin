package com.google.firebase.crashlytics.internal.model;

import defpackage.qc0;
import defpackage.tec;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_ProfilingManagerInfo_ProfilingTrigger extends CrashlyticsReport.ProfilingManagerInfo.ProfilingTrigger {
    private final int trigger;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class Builder extends CrashlyticsReport.ProfilingManagerInfo.ProfilingTrigger.Builder {
        private byte set$0;
        private int trigger;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ProfilingManagerInfo.ProfilingTrigger.Builder
        public CrashlyticsReport.ProfilingManagerInfo.ProfilingTrigger build() {
            if (this.set$0 == 1) {
                return new AutoValue_CrashlyticsReport_ProfilingManagerInfo_ProfilingTrigger(this.trigger);
            }
            qc0.p("Missing required properties: trigger");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ProfilingManagerInfo.ProfilingTrigger.Builder
        public CrashlyticsReport.ProfilingManagerInfo.ProfilingTrigger.Builder setTrigger(int i) {
            this.trigger = i;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }
    }

    private AutoValue_CrashlyticsReport_ProfilingManagerInfo_ProfilingTrigger(int i) {
        this.trigger = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CrashlyticsReport.ProfilingManagerInfo.ProfilingTrigger) && this.trigger == ((CrashlyticsReport.ProfilingManagerInfo.ProfilingTrigger) obj).getTrigger();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ProfilingManagerInfo.ProfilingTrigger
    public int getTrigger() {
        return this.trigger;
    }

    public int hashCode() {
        return this.trigger ^ 1000003;
    }

    public String toString() {
        return tec.g(this.trigger, "}", new StringBuilder("ProfilingTrigger{trigger="));
    }
}

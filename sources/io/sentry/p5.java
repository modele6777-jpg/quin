package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum p5 implements k2 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Log("log"),
    TraceMetric("trace_metric"),
    Span("span"),
    Unknown("__unknown__");

    private final String itemType;

    p5(String str) {
        this.itemType = str;
    }

    public static p5 resolve(Object obj) {
        if (obj instanceof i5) {
            return ((io.sentry.protocol.k) ((i5) obj).b.x("feedback", io.sentry.protocol.k.class)) == null ? Event : Feedback;
        }
        if (obj instanceof io.sentry.protocol.f0) {
            return Transaction;
        }
        if (obj instanceof c7) {
            return Session;
        }
        return obj instanceof io.sentry.clientreport.b ? ClientReport : Attachment;
    }

    public static p5 valueOfLabel(String str) {
        for (p5 p5Var : values()) {
            if (p5Var.itemType.equals(str)) {
                return p5Var;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.k2
    public void serialize(m3 m3Var, z0 z0Var) {
        ((io.sentry.internal.debugmeta.c) m3Var).z(this.itemType);
    }
}

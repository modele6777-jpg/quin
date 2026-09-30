package tech.chatmind.api.personality;

import defpackage.ag2;
import defpackage.an1;
import defpackage.lsb;
import defpackage.msb;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.wrb;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b\u0005\u0010\u0019¨\u0006*"}, d2 = {"Ltech/chatmind/api/personality/ReportServerData;", "", "Ltech/chatmind/api/personality/ReportData;", "report", "", "isLocked", "<init>", "(Ltech/chatmind/api/personality/ReportData;Z)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/personality/ReportData;ZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/personality/ReportServerData;Lag2;Lnyc;)V", "write$Self", "component1", "()Ltech/chatmind/api/personality/ReportData;", "component2", "()Z", "copy", "(Ltech/chatmind/api/personality/ReportData;Z)Ltech/chatmind/api/personality/ReportServerData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ltech/chatmind/api/personality/ReportData;", "getReport", "Z", "Companion", "lsb", "msb", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class ReportServerData {
    public static final int $stable = 0;
    public static final msb Companion = new msb();
    private final boolean isLocked;
    private final ReportData report;

    public /* synthetic */ ReportServerData(int i, ReportData reportData, boolean z, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, lsb.a.e());
            throw null;
        }
        this.report = reportData;
        this.isLocked = z;
    }

    public static /* synthetic */ ReportServerData copy$default(ReportServerData reportServerData, ReportData reportData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            reportData = reportServerData.report;
        }
        if ((i & 2) != 0) {
            z = reportServerData.isLocked;
        }
        return reportServerData.copy(reportData, z);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(ReportServerData self, ag2 output, nyc serialDesc) {
        output.p(serialDesc, 0, wrb.a, self.report);
        output.o(serialDesc, 1, self.isLocked);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ReportData getReport() {
        return this.report;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLocked() {
        return this.isLocked;
    }

    public final ReportServerData copy(ReportData report, boolean isLocked) {
        report.getClass();
        return new ReportServerData(report, isLocked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportServerData)) {
            return false;
        }
        ReportServerData reportServerData = (ReportServerData) other;
        return pa7.t(this.report, reportServerData.report) && this.isLocked == reportServerData.isLocked;
    }

    public final ReportData getReport() {
        return this.report;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLocked) + (this.report.hashCode() * 31);
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public String toString() {
        return "ReportServerData(report=" + this.report + ", isLocked=" + this.isLocked + ")";
    }

    public ReportServerData(ReportData reportData, boolean z) {
        reportData.getClass();
        this.report = reportData;
        this.isLocked = z;
    }
}

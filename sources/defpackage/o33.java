package defpackage;

import ai.askquin.ui.explore.model.DailyCardBasicInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o33 implements q33 {
    public final DailyCardBasicInfo a;

    static {
        b33 b33Var = DailyCardBasicInfo.Companion;
    }

    public o33(DailyCardBasicInfo dailyCardBasicInfo) {
        this.a = dailyCardBasicInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o33) && this.a.equals(((o33) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnShare(basicInfo=" + this.a + ")";
    }
}

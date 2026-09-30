package defpackage;

import java.util.ArrayList;
import tech.chatmind.api.seasonal.model.SeasonalUserInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class arc {
    public final SeasonalUserInfo a;
    public final ArrayList b;

    static {
        nsc nscVar = SeasonalUserInfo.Companion;
    }

    public arc(SeasonalUserInfo seasonalUserInfo, ArrayList arrayList) {
        this.a = seasonalUserInfo;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arc)) {
            return false;
        }
        arc arcVar = (arc) obj;
        return this.a.equals(arcVar.a) && this.b.equals(arcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CreationInput(userInfo=" + this.a + ", cards=" + this.b + ")";
    }
}

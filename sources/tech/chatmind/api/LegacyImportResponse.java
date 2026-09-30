package tech.chatmind.api;

import defpackage.a38;
import defpackage.ag2;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.ov7;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rp3;
import defpackage.t28;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Ltech/chatmind/api/LegacyImportResponse;", "", "", "total", "", "Ltech/chatmind/api/LegacyImportItem;", "items", "<init>", "(ILjava/util/List;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(IILjava/util/List;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/LegacyImportResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Ltech/chatmind/api/LegacyImportResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTotal", "Ljava/util/List;", "getItems", "Companion", "z28", "a38", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class LegacyImportResponse {
    public static final int $stable = 8;
    private final List<LegacyImportItem> items;
    private final int total;
    public static final a38 Companion = new a38();
    private static final lw7[] $childSerializers = {null, eb3.N(z18.b, new ov7(2))};

    public /* synthetic */ LegacyImportResponse(int i, int i2, List list, xyc xycVar) {
        this.total = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.items = pu4.a;
        } else {
            this.items = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(t28.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LegacyImportResponse copy$default(LegacyImportResponse legacyImportResponse, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = legacyImportResponse.total;
        }
        if ((i2 & 2) != 0) {
            list = legacyImportResponse.items;
        }
        return legacyImportResponse.copy(i, list);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(LegacyImportResponse self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || self.total != 0) {
            output.v(0, self.total, serialDesc);
        }
        if (!output.g(serialDesc) && pa7.t(self.items, pu4.a)) {
            return;
        }
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public final List<LegacyImportItem> component2() {
        return this.items;
    }

    public final LegacyImportResponse copy(int total, List<LegacyImportItem> items) {
        items.getClass();
        return new LegacyImportResponse(total, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegacyImportResponse)) {
            return false;
        }
        LegacyImportResponse legacyImportResponse = (LegacyImportResponse) other;
        return this.total == legacyImportResponse.total && pa7.t(this.items, legacyImportResponse.items);
    }

    public final List<LegacyImportItem> getItems() {
        return this.items;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.total) * 31);
    }

    public String toString() {
        return "LegacyImportResponse(total=" + this.total + ", items=" + this.items + ")";
    }

    public LegacyImportResponse() {
        this(0, (List) null, 3, (rp3) (0 == true ? 1 : 0));
    }

    public LegacyImportResponse(int i, List<LegacyImportItem> list) {
        list.getClass();
        this.total = i;
        this.items = list;
    }

    public /* synthetic */ LegacyImportResponse(int i, List list, int i2, rp3 rp3Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? pu4.a : list);
    }
}

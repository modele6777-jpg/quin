package tech.chatmind.api;

import defpackage.ag2;
import defpackage.ks0;
import defpackage.luc;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Ltech/chatmind/api/SelectedCard;", "", "", "key", "", "direction", "name", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/SelectedCard;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;ILjava/lang/String;)Ltech/chatmind/api/SelectedCard;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "I", "getDirection", "getName", "Companion", "kuc", "luc", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SelectedCard {
    public static final int $stable = 0;
    public static final luc Companion = new luc();
    private final int direction;
    private final String key;
    private final String name;

    public /* synthetic */ SelectedCard(int i, String str, int i2, String str2, xyc xycVar) {
        this.key = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.direction = 1;
        } else {
            this.direction = i2;
        }
        if ((i & 4) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
    }

    public static /* synthetic */ SelectedCard copy$default(SelectedCard selectedCard, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = selectedCard.key;
        }
        if ((i2 & 2) != 0) {
            i = selectedCard.direction;
        }
        if ((i2 & 4) != 0) {
            str2 = selectedCard.name;
        }
        return selectedCard.copy(str, i, str2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(SelectedCard self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || !pa7.t(self.key, "")) {
            output.w(serialDesc, 0, self.key);
        }
        if (output.g(serialDesc) || self.direction != 1) {
            output.v(1, self.direction, serialDesc);
        }
        if (!output.g(serialDesc) && self.name == null) {
            return;
        }
        output.A(serialDesc, 2, p4e.a, self.name);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDirection() {
        return this.direction;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final SelectedCard copy(String key, int direction, String name) {
        key.getClass();
        return new SelectedCard(key, direction, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedCard)) {
            return false;
        }
        SelectedCard selectedCard = (SelectedCard) other;
        return pa7.t(this.key, selectedCard.key) && this.direction == selectedCard.direction && pa7.t(this.name, selectedCard.name);
    }

    public final int getDirection() {
        return this.direction;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iB = ub3.b(this.direction, this.key.hashCode() * 31, 31);
        String str = this.name;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.key;
        int i = this.direction;
        return ks0.l(ks0.p("SelectedCard(key=", str, ", direction=", i, ", name="), this.name, ")");
    }

    public SelectedCard() {
        this((String) null, 0, (String) null, 7, (rp3) null);
    }

    public SelectedCard(String str, int i, String str2) {
        str.getClass();
        this.key = str;
        this.direction = i;
        this.name = str2;
    }

    public /* synthetic */ SelectedCard(String str, int i, String str2, int i2, rp3 rp3Var) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? null : str2);
    }
}

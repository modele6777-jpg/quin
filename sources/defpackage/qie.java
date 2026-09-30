package defpackage;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqie;", "Ljzc;", "", "", "tarotIds", "Ljava/util/List;", "d", "()Ljava/util/List;", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final class qie extends jzc {
    private final List<String> tarotIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qie(String str, int i, int i2, List list) {
        super(i, i2, str, null, null, 248);
        str.getClass();
        this.tarotIds = list;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getTarotIds() {
        return this.tarotIds;
    }
}

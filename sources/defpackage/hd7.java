package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhd7;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "", "itemOffset", "I", "a", "()I", "Lwz;", "", "Lxz;", "previousAnimation", "Lwz;", "b", "()Lwz;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class hd7 extends CancellationException {
    private final int itemOffset;
    private final wz previousAnimation;

    public hd7(int i, wz wzVar) {
        this.itemOffset = i;
        this.previousAnimation = wzVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getItemOffset() {
        return this.itemOffset;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final wz getPreviousAnimation() {
        return this.previousAnimation;
    }
}

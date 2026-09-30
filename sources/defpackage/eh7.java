package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eh7 implements lk9 {
    public final /* synthetic */ int a;

    @Override // defpackage.fv4
    public final void encode(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new kv4("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                mk9 mk9Var = (mk9) obj2;
                mk9Var.a(y0b.f, entry.getKey());
                mk9Var.a(y0b.g, entry.getValue());
                return;
            default:
                throw new kv4("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}

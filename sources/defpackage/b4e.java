package defpackage;

import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b4e extends gbe implements n26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        b4e b4eVar = new b4e(3, (xn2) obj3);
        b4eVar.L$0 = (String) obj;
        b4eVar.L$1 = (StringWriter) obj2;
        return b4eVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String str = (String) this.L$0;
        StringWriter stringWriter = (StringWriter) this.L$1;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        StringWriter stringWriterAppend = stringWriter.append((CharSequence) str);
        stringWriterAppend.getClass();
        return stringWriterAppend;
    }
}

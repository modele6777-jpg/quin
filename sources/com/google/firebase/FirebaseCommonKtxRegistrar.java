package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.af8;
import defpackage.hj6;
import defpackage.kb2;
import defpackage.l01;
import defpackage.l58;
import defpackage.lb2;
import defpackage.ndb;
import defpackage.ns0;
import defpackage.qk6;
import defpackage.sv2;
import defpackage.t72;
import defpackage.xw3;
import defpackage.y3b;
import defpackage.yaf;
import defpackage.z7c;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Llb2;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<lb2> getComponents() {
        kb2 kb2VarA = lb2.a(new y3b(ns0.class, sv2.class));
        kb2VarA.a(new xw3(new y3b(ns0.class, Executor.class), 1, 0));
        kb2VarA.f = hj6.I0;
        lb2 lb2VarB = kb2VarA.b();
        kb2 kb2VarA2 = lb2.a(new y3b(l58.class, sv2.class));
        kb2VarA2.a(new xw3(new y3b(l58.class, Executor.class), 1, 0));
        kb2VarA2.f = qk6.Y;
        lb2 lb2VarB2 = kb2VarA2.b();
        kb2 kb2VarA3 = lb2.a(new y3b(l01.class, sv2.class));
        kb2VarA3.a(new xw3(new y3b(l01.class, Executor.class), 1, 0));
        kb2VarA3.f = af8.z;
        lb2 lb2VarB3 = kb2VarA3.b();
        kb2 kb2VarA4 = lb2.a(new y3b(yaf.class, sv2.class));
        kb2VarA4.a(new xw3(new y3b(yaf.class, Executor.class), 1, 0));
        kb2VarA4.f = ndb.U0;
        return t72.I(lb2VarB, lb2VarB2, lb2VarB3, kb2VarA4.b());
    }
}

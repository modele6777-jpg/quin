package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nb3 extends gbe implements a26 {
    final /* synthetic */ kb3 $migration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb3(kb3 kb3Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.$migration = kb3Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new nb3(this.$migration, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws IOException {
        Context context;
        String str;
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        kb3 kb3Var = this.$migration;
        this.label = 1;
        xcd xcdVar = (xcd) kb3Var;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) xcdVar.e.getValue()).edit();
        Set set = xcdVar.f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            yg5.m("Unable to delete migrated keys from SharedPreferences.");
            return null;
        }
        if (((SharedPreferences) xcdVar.e.getValue()).getAll().isEmpty() && (context = xcdVar.c) != null && (str = xcdVar.d) != null) {
            context.deleteSharedPreferences(str);
        }
        if (set != null) {
            set.clear();
        }
        bw2 bw2Var = bw2.a;
        return wefVar == bw2Var ? bw2Var : wefVar;
    }
}

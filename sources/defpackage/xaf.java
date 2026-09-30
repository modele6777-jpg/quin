package defpackage;

import ai.askquin.qa.bridge.QaResult;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xaf implements d3b {
    public static ti7 e(View view) {
        Object dzbVar;
        CharSequence text;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("class", oh7.c(view.getClass().getSimpleName()));
        try {
            dzbVar = view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        String str = (String) dzbVar;
        if (str != null) {
            linkedHashMap.put("id", oh7.c(str));
        }
        CharSequence contentDescription = view.getContentDescription();
        if (contentDescription != null) {
            linkedHashMap.put("desc", oh7.c(contentDescription.toString()));
        }
        if ((view instanceof TextView) && (text = ((TextView) view).getText()) != null) {
            linkedHashMap.put("text", oh7.c(text.toString()));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                z67 z67VarC0 = mh3.c0(0, viewGroup.getChildCount());
                ArrayList arrayList = new ArrayList(t72.u(z67VarC0, 10));
                Iterator it = z67VarC0.iterator();
                while (((y67) it).c) {
                    View childAt = viewGroup.getChildAt(((q67) it).nextInt());
                    childAt.getClass();
                    arrayList.add(e(childAt));
                }
                linkedHashMap.put("children", new yg7(arrayList));
            }
        }
        return new ti7(linkedHashMap);
    }

    @Override // defpackage.d3b
    public final dm1 a() {
        return dm1.a;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        View decorView;
        Activity activity = ir5.c;
        if (activity == null) {
            return new QaResult.Ok(new ti7(bm8.H(new iy9("foreground", qi7.INSTANCE), new iy9("note", oh7.c("no resumed activity registered")))));
        }
        Window window = activity.getWindow();
        return (window == null || (decorView = window.getDecorView()) == null) ? new QaResult.Ok(new ti7(bm8.H(new iy9("foreground", oh7.c(activity.getClass().getName())), new iy9("tree", qi7.INSTANCE)))) : new QaResult.Ok(new ti7(bm8.H(new iy9("foreground", oh7.c(activity.getClass().getName())), new iy9("tree", e(decorView)))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "ui.semantics-dump";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "dump 前台 Activity 的 view 树（class/id/desc/text）";
    }
}

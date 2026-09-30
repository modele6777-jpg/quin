package com.franmontiel.persistentcookiejar.cache;

import defpackage.eu2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class SetCookieCache implements CookieCache {
    public HashSet a;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public class SetCookieCacheIterator implements Iterator<eu2> {
        public Iterator a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public final eu2 next() {
            return ((IdentifiableCookie) this.a.next()).a;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.a.remove();
        }
    }

    public final void a(List list) {
        HashSet hashSet = this.a;
        ArrayList<IdentifiableCookie> arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eu2 eu2Var = (eu2) it.next();
            IdentifiableCookie identifiableCookie = new IdentifiableCookie();
            identifiableCookie.a = eu2Var;
            arrayList.add(identifiableCookie);
        }
        for (IdentifiableCookie identifiableCookie2 : arrayList) {
            hashSet.remove(identifiableCookie2);
            hashSet.add(identifiableCookie2);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<eu2> iterator() {
        SetCookieCacheIterator setCookieCacheIterator = new SetCookieCacheIterator();
        setCookieCacheIterator.a = this.a.iterator();
        return setCookieCacheIterator;
    }
}

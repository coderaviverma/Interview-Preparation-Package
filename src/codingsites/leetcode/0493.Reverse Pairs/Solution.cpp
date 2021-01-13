class Solution {
private:
    inline bool cmp1(vector<int>::iterator a,
                    vector<int>::iterator b)
    {
        if (*a >= 0 && *b >= 0)
        {
            const unsigned ua = *a, ub = *b ;
            return ua <= (ub << 1) ;
        }
        
        if (*a < 0 && *b < 0)
        {
            const unsigned ua = -*a, ub = -*b ;
            return ua >= (ub << 1) ;
        }
        
        if (*a < 0 && *b >= 0)
            return true ;
        
        if (*a >= 0 && *b < 0)
            return false ;
    }

    unsigned CountLRPairs(vector<int>::iterator start,
                          vector<int>::iterator end)
    {
        if (start + 1 >= end)
            return 0 ;
        if (start + 2 == end)
        {
            if (*start <= *(start+1))
                return !cmp1(start, start+1) ; // ����ҲҪ���㣬ӦΪ�����и���
            else // ���ҲҪ������Ҫ�ر�ע�������������a[i] < a[j]���������������a[i] < 2*a[j]
            {
                swap(*start, *(start+1)) ;
                return !cmp1(start+1, start) ; // ������λ����
            }
        }

        vector<int>::iterator mid = start + ((end-start) >> 1) ;
        vector<int>::iterator pF = start, pB = mid ;
        int cnt = CountLRPairs(start, mid) + CountLRPairs(mid, end) ;
        while (pF != mid)
        {
            while (pB != end && !cmp1(pF, pB))
                ++pB ;
            cnt += pB-mid ;
            ++pF ;
        }

        vector<int> tmp(start, mid) ;
        pF = tmp.begin() ;
        pB = mid ;
        vector<int>::iterator p = start ;

        auto size = end - start ;
        if (size == 10)
            ++size ;

        while (pF != tmp.end() && pB != end)
        {
            if (*pF <= *pB)
                *p++ = *pF++ ;
            else
                *p++ = *pB++ ;
        }
        while (pF != tmp.end())
            *p++ = *pF++ ;
        while (pB != end)
            *p++ = *pB++ ;

        return cnt ;
    }
public:
    int reversePairs(vector<int>& nums) {
        return CountLRPairs(nums.begin(), nums.end()) ;
    }
};
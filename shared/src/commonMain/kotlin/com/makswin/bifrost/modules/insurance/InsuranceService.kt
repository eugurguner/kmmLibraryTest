package com.makswin.bifrost.modules.insurance

import com.makswin.bifrost.core.utils.BaseRepository

class InsuranceService : BaseRepository() {

    /**
     *
     * @author alkincakiralar
     */
    /*fun checkInsurance(userId: String, completion: (ResponseType, InsuranceModel?) -> Unit) {

        scope.launch {

            val query = CheckInsuranceQuery(userId)

            val response = executeQuery(query)

            if (!checkQueryResponse(response)) {
                completion(ResponseType.Error, null)
                return@launch
            }

            val data = response.data?.koalay_dealer_info?.fragmentInsurance

            if (data == null) {
                completion(ResponseType.Error, null)
                return@launch
            }

            val insurance = InsuranceModel(data)

            if (insurance.urlResidencial.isEmpty()) {
                completion(ResponseType.Error, null)
                return@launch
            }

            completion(ResponseType.Success, insurance)

        }

    }*/

    /**
     *
     * @author alkincakiralar
     */
    /*fun createInsuranceUser(identityNumber: String, completion: (ResponseType) -> Unit) {

        scope.launch {

            val input = KoalayDefineDealerInput(identityNumber)

            val mutation = CreateInsuranceMutation(input)

            val response = executeMutation(mutation)

            if (!checkMutationResponse(response)) {
                completion(ResponseType.Error)
                return@launch
            }

            val data = response.data?.koalay_define_dealer?.fragmentInsurance

            if (data == null) {
                completion(ResponseType.Error)
                return@launch
            }

            completion(ResponseType.Success)

        }

    }*/

}